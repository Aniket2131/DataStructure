import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sortAnArrayAccordingToTheOther {
    public static void main(String[] args) {
        int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int A2[] = { 2, 1, 8, 3 };
        System.out.println(Arrays.toString(sortA1ByA2(A1, A1.length, A2, A2.length)));
    }

    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        // Your code here
        int[] ans = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : A1) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int el : A2)
            set.add(el);
        int i = 0;
        for (int el : A2) {
            if (set.contains(el)) {
                if (map.containsKey(el)) {
                    for (int j = 0; map.get(el) > j; j++) {
                        ans[i] = el;
                        i++;
                    }
                }
            }
            set.remove(el);
            map.remove((el));
        }
        Arrays.sort(A1);
        for (int el : A1) {
            if (map.containsKey(el)) {
                ans[i] = el;
                i++;
            }
        }
        return ans;
    }
}