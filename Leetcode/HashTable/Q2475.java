import java.util.HashMap;
import java.util.Map;

public class Q2475 {
    public static void main(String[] args) {
        int[] nums = { 4, 4, 2, 4, 3 };
        System.out.println(unequalTriplets(nums));
    }

    public static int unequalTriplets(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        int ans = n * (n - 1) * (n - 2) / 6;
        for (int el : map.values()) {
            if (2 > el)
                continue;
            int cnt3 = el * (el - 1) * (el - 2) / 6;
            int cnt2 = el * (el - 1) * (n - el) / 2;
            ans -= cnt3 + cnt2;
        }
        return ans;
    }
}
