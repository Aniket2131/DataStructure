import java.util.HashMap;
import java.util.Map;

public class Q961 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        System.out.println(repeatedNTimes(nums));
    }

    public static int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;
        int ans = 0;
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
            if (map.containsKey(el)) {
                if (map.get(el) == n) {
                    ans = el;
                    break;
                }
            }
        }
        return ans;
    }
}
