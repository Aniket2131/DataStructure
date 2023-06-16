import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2341 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1, 3, 2, 2 };
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (int el : map.keySet()) {
            int num = map.get(el);
            if (num % 2 == 0) {
                ans[0] += num / 2;
            } else {
                ans[0] += num / 2;
                ans[1] += num % 2;
            }
        }
        return ans;
    }
}