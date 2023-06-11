import java.util.Arrays;

public class TripletsWithZeroSum {
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        System.out.println(findTriplets(arr, 0));
    }

    public static boolean findTriplets(int arr[], int n) {
        // add code here.
        Arrays.sort(arr);
        for (int i = 0; n - 2 > i; i++) {
            int j = i + 1;
            int k = n - 1;
            while (k > j) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    return true;
                } else if (arr[i] + arr[j] + arr[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return false;
    }
}