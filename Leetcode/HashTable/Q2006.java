
import java.util.HashMap;

public class Q2006 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1 };
        System.out.println(countKDifference(nums, 1));
    }

    public static int countKDifference(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; nums.length > i; i++) {
            if (map.containsKey(nums[i] - k)) {
                ans += map.get(nums[i] - k);
            }
            if (map.containsKey(nums[i] + k)) {
                ans += map.get(nums[i] + k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return ans;
    }
}
