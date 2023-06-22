public class countPairsInArrayDivisibleByK {
    public static void main(String[] args) {
        int A[] = { 2, 2, 1, 7, 5, 3 };
        // int A[] = { 10, 6, 3, 3 };
        int K = 4;
        System.out.println(countKdivPairs(A, A.length, K));
    }

    public static long countKdivPairs(int arr[], int n, int k) {
        // code here
        int[] remArr = new int[k + 1];
        long ans = 0;
        for (int el : arr) {
            int rem = el % k;
            if (rem == 0 && remArr[rem] > 0) {
                ans += remArr[rem];
            } else if (remArr[k - rem] > 0)
                ans += remArr[k - rem];
            remArr[rem]++;
        }
        return ans;
    }
}