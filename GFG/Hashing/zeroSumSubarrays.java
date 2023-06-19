import java.util.HashMap;
import java.util.Map;

public class zeroSumSubarrays {
    public static void main(String[] args) {
        long arr[] = { 0, 0, 5, 5, 0, 0 };
        System.out.println(findSubarray(arr, arr.length));
    }

    public static long findSubarray(long[] arr, int n) {
        // Your code here
        Map<Long, Long> map = new HashMap<>();
        long ans = 0;
        long sum = 0;
        map.put((long) 0, (long) 1);
        for (long el : arr) {
            sum += el;
            if (map.containsKey(sum)) {
                ans += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, (long) 0) + 1);
        }
        return ans;
    }
}