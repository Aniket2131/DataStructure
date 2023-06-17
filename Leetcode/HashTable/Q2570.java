import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q2570 {
    public static void main(String[] args) {
        int[][] nums1 = { { 1, 2 }, { 2, 3 }, { 4, 5 } }, nums2 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
        System.out.println(mergeArrays(nums1, nums2));
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; nums1.length > i; i++) {
            map.put(nums1[i][0], map.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }
        for (int i = 0; nums2.length > i; i++) {
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int[][] ans = new int[map.size()][2];
        int i = 0;
        for (int el : map.keySet()) {
            ans[i][0] = el;
            ans[i][1] = map.get(el);
            i++;
        }
        Arrays.sort(ans, new Comparator<int[]>() {
            public int compare(int[] frst, int[] scnd) {
                if (frst[0] > scnd[0])
                    return 1;
                else
                    return -1;
            }
        });
        return ans;
    }
}
