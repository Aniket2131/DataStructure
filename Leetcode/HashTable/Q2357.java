import java.util.HashMap;
import java.util.Map;

public class Q2357 {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 0, 3, 5 };
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : nums)
            map.put(el, map.getOrDefault(el, 0) + 1);
        return map.containsKey(0) ? map.size() - 1 : map.size();
    }
}
