import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class findMissingInSecondArray {
    public static void main(String[] args) {
        long A[] = { 1, 2, 3, 4, 5, 10 };
        long B[] = { 2, 3, 1, 0, 5 };
        System.out.println(findMissing(A, B, A.length, B.length));
    }

    public static ArrayList<Long> findMissing(long A[], long B[], int N, int M) {
        Set<Long> set = new HashSet<>();
        ArrayList<Long> ans = new ArrayList<>();
        for (long el : B)
            set.add(el);
        for (long el : A) {
            if (!set.contains(el))
                ans.add(el);
        }
        return ans;
    }
}