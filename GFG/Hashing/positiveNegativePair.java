import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class positiveNegativePair {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, -2, -1, -3, 2, 7 };
        System.out.println(findPairs(arr, arr.length));
    }

    public static ArrayList<Integer> findPairs(int arr[], int n) {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int el : arr) {
            if (el > 0) {
                if (set.contains(-el)) {
                    set.remove(-el);
                    ans.add(-el);
                    ans.add(el);
                } else {
                    set.add(el);
                }
            } else if (0 > el) {
                if (set.contains(-el)) {
                    ans.add(el);
                    ans.add(-el);
                    set.remove(el);
                } else {
                    set.add(el);
                }
            }
        }
        return ans;
    }
}
