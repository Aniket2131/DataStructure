import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2215 {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 3 };
        int[] nums2 = { 1, 1, 2, 2 };
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> lis = new ArrayList<>();
        lis.add(new ArrayList<Integer>());
        lis.add(new ArrayList<Integer>());
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; nums1.length > i; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; nums2.length > i; i++) {
            set2.add(nums2[i]);
        }

        for (int num : set1) {
            if (!set2.contains(num)) {
                lis.get(0).add(num);
            }
        }
        for (int num : set2) {
            if (!set1.contains(num)) {
                lis.get(1).add(num);
            }
        }
        return lis;
    }
}
