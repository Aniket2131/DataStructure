import java.util.HashSet;
import java.util.Set;

public class Q2154 {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 6, 1, 12 };
        System.out.println(findFinalValue(nums, 3));
    }

    public static int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int el : nums)
            set.add(el);
        while (set.contains(original)) {
            original *= 2;
        }
        return original;
    }
}
