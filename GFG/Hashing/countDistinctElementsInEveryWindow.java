import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class countDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int A[] = { 1, 2, 1, 3, 4, 2, 3 };
        System.out.println(countDistinct(A, A.length, 4));
    }

    public static ArrayList<Integer> countDistinct(int A[], int n, int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        if (k > n)
            return ans;
        for (int i = 0; n > i; i++) {
            if (k > i) {
                map.put(A[i], map.getOrDefault(A[i], 0) + 1);
                if (i == k - 1)
                    ans.add(map.size());
            } else {
                map.put(A[i - k], map.get(A[i - k]) - 1);
                if (map.get(A[i - k]) == 0)
                    map.remove(A[i - k]);
                map.put(A[i], map.getOrDefault(A[i], 0) + 1);
                ans.add(map.size());
            }
        }
        return ans;
    }
}
