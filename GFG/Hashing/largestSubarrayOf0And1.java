import java.util.HashMap;
import java.util.Map;

public class largestSubarrayOf0And1 {
    public static void main(String[] args) {
        int A[] = { 0, 1, 0, 1 };
        System.out.println(maxLen(A, A.length));
    }

    public static int maxLen(int[] arr, int N) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; N > i; i++) {
            int num = arr[i];
            if (num == 0) {
                sum -= 1;
            }
            if (num == 1)
                sum += 1;
            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
