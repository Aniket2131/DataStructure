import java.util.HashMap;
import java.util.Map;

public class Q128 {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int ans = 0;
        for (int el : nums)
            map.put(el, true);
        for (int el : nums) {
            if (map.containsKey(el - 1))
                map.put(el, false);
        }
        for (int el : nums) {
            if (map.get(el)) {
                int i = 1;
                while (map.containsKey(el + 1)) {
                    i++;
                    el++;
                }
                ans = Math.max(ans, i);
            }
        }
        return ans == Integer.MIN_VALUE ? 0 : ans;
    }
}