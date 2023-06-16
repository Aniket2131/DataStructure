import java.util.HashSet;
import java.util.Set;

public class subarrayWith0sum {
    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        System.out.println(findsum(arr, arr.length));
    }

    public static boolean findsum(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] == 0)
                return true;
            sum += arr[i];
            if (sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
