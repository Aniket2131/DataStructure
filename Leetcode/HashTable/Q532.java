import java.util.HashMap;
import java.util.Map;

public class Q532 {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5 };
        System.out.println(findPairs(nums, 2));
    }

    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int ans = 0;
        for (int el : map.keySet()) {
            if ((k > 0 && map.containsKey(k + el)) || (0 == k && map.get(el) > 1)) {
                ans++;
            }
        }

        return ans;
    }
}