import java.util.HashMap;
import java.util.Map;

public class Q525 {
    public static void main(String[] args) {
        int[] nums = { 0, 1 };
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = -1;
        map.put(sum, -1);
        int ans = 0;
        for (int i = 0; nums.length > i; i++) {
            if (nums[i] == 0) {
                sum -= 1;
                if (map.containsKey(sum)) {
                    ans = Math.max(ans, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            } else {
                sum += 1;
                if (map.containsKey(sum)) {
                    ans = Math.max(ans, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return ans;
    }
}
