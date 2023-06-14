import java.util.HashSet;
import java.util.Set;

public class keyPair {
    public static void main(String[] args) {
        int Arr[] = { 1, 4, 45, 6, 10, 8 };
        System.out.println(hasArrayTwoCandidates(Arr, 6, 16));
    }

    public static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Set<Integer> num = new HashSet<>();
        for (int el : arr) {
            if (num.contains(x - el))
                return true;
            num.add(el);
        }
        return false;
    }
}
