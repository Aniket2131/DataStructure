import java.util.ArrayList;
import java.util.List;

public class Q2032 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 3, 2 }, nums2 = { 2, 3 }, nums3 = { 3 };
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        int[] fre = new int[101];
        for (int el : nums1) {
            fre[el] = 1;
        }
        for (int el : nums2) {
            if (fre[el] == 1) {
                ans.add(el);
                fre[el] = -1;
            } else if (fre[el] == 0) {
                fre[el] = 2;
            }
        }
        for (int el : nums3) {
            if (fre[el] == 1 || fre[el] == 2) {
                ans.add(el);
                fre[el] = -1;
            }
        }
        return ans;
    }
}
