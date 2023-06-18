import java.util.HashMap;
import java.util.Map;

public class Q560 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        System.out.println(subarraySum(nums, nums.length));
    }

    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
