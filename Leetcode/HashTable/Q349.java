import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q349 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 }, nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int el : nums1)
            set1.add(el);
        int[] ans = new int[set1.size()];
        int i = 0;
        for (int el : nums2) {
            if (set1.contains(el)) {
                ans[i] = el;
                set1.remove(el);
                i++;
            }
        }
        return Arrays.copyOfRange(ans, 0, i);
    }
}
