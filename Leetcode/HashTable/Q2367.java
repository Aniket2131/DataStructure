import java.util.HashSet;
import java.util.Set;

public class Q2367 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 4, 6, 7, 10 };
        System.out.println(arithmeticTriplets(nums, 3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int el : nums) {
            set.add(el);
        }
        for (int el : nums) {
            if (set.contains(el - diff) && set.contains(el + diff)) {
                ans++;
            }
        }
        return ans;
    }
}