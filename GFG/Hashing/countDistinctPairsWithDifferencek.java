import java.util.HashMap;
import java.util.Map;

public class countDistinctPairsWithDifferencek {
    public static void main(String[] args) {
        int[] array = { 1, 5, 4, 1, 2 };
        int k = 0;
        System.out.println(TotalPairs(array, k));
    }

    public static int TotalPairs(int[] nums, int k) {
        // Code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int ans = 0;
        for (int el : map.keySet()) {
            if ((k > 0 && map.containsKey(k + el)) || (0 == k && map.get(el) >= 2)) {
                ans++;
            }
        }
        return ans;
    }
}
