import java.util.HashSet;
import java.util.Set;

public class sumEqualsToSum {
    public static void main(String[] args) {
        int A[] = { 3, 4, 7, 1, 2, 9, 8 };
        System.out.println(findPairs(A, A.length));
    }

    public static int findPairs(int arr[], int n) {
        // code here.
        Set<Integer> set = new HashSet<>();
        for (int i = 0; n - 1 > i; i++) {
            for (int j = i + 1; n > j; j++) {
                if (set.contains(arr[i] + arr[j])) {
                    return 1;
                }
                set.add(arr[i] + arr[j]);
            }
        }
        return 0;
    }
}
