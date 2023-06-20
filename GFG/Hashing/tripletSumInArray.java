import java.util.Arrays;

public class tripletSumInArray {
    public static void main(String[] args) {
        int[] A = { 3, 2, 2, 3 };
        System.out.println(find3Numbers(A, A.length, 6));
    }

    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);
        for (int i = 0; n - 2 > i; i++) {
            int low = i + 1, high = n - 1;
            while (high > low) {
                if (X - A[low] - A[high] == A[i])
                    return true;
                else if (A[i] > X - A[low] - A[high])
                    high--;
                else {
                    low++;
                }
            }
        }
        return false;
    }
}
