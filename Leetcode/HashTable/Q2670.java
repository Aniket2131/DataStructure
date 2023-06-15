import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2670 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] ans = new int[nums.length];
        Map<Integer, Integer> suf = new HashMap<>();
        Map<Integer, Integer> pre = new HashMap<>();
        for (int el : nums) {
            suf.put(el, suf.getOrDefault(el, 0) + 1);
        }

        for (int i = 0; nums.length > i; i++) {
            pre.put(nums[i], pre.getOrDefault(nums[i], 0) + 1);
            suf.put(nums[i], suf.getOrDefault(nums[i], 0) - 1);
            if (suf.get(nums[i]) == 0)
                suf.remove(nums[i]);
            ans[i] = pre.size() - suf.size();
        }
        return ans;
    }
}