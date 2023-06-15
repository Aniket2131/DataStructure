import java.util.HashMap;
import java.util.Map;

public class countPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1 };
        System.out.println(getPairsCount(arr, 4, 2));
    }

    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; arr.length > i; i++) {
            if (map.containsKey(k - arr[i])) {
                ans += map.get(k - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return ans;
    }
}
