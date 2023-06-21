import java.util.Arrays;

public class swappingPairsMakeSumEqual {
    public static void main(String[] args) {
        long A[] = { 4, 1, 2, 1, 1, 2 };
        long B[] = { 3, 6, 3, 3 };
        System.out.println(findSwapValues(A, A.length, B, B.length));
    }

    public static long findSwapValues(long A[], int n, long B[], int m) {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);
        long sumA = 0;
        for (long el : A)
            sumA += el;

        long sumB = 0;
        for (long el : B)
            sumB += el;

        int i = 0, j = 0;
        while (A.length > i && B.length > j) {
            long a = sumA - A[i] + B[j];
            long b = sumB - B[j] + A[i];
            if (a == b)
                return 1;
            else if (b > a)
                j++;
            else {
                i++;
            }
        }
        return -1;
    }
}
