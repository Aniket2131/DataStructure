import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findAllPairsWithAGivenSum {
    public static class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        long A[] = { 1, 2, 4, 5, 7 };
        long B[] = { 5, 6, 3, 4, 8 };
        long X = 9;
        System.out.println(Arrays.toString(allPairs(A, B, A.length, B.length, X)));
    }

    public static pair[] allPairs(long A[], long B[], long N, long M, long X) {
        // Your code goes here
        Set<Long> set = new HashSet<>();
        ArrayList<pair> arr = new ArrayList<>();
        Arrays.sort(A);
        for (Long el : B) {
            set.add(el);
        }
        for (int i = 0; A.length > i; i++) {
            if (set.contains(X - A[i])) {
                pair p = new pair(A[i], X - A[i]);
                arr.add(p);

            }
        }
        pair[] ans = new pair[arr.size()];
        int i = 0;
        for (pair x : arr) {
            ans[i++] = x;
        }

        return ans;
    }
}
