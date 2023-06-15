import java.util.HashMap;
import java.util.Map;

public class Q1748 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2 };
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (int el : map.keySet()) {
            if (map.get(el) == 1)
                ans += el;
        }
        return ans;
    }
}