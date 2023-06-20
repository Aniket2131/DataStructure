public class absoluteDifferenceDivisibleByK {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 11 };
        System.out.println(countPairs(arr.length, arr, 3));
    }

    public static long countPairs(int n, int[] arr, int k) {
        // code here
        int[] remArr = new int[k];
        for (int el : arr) {
            remArr[el % k]++;
        }
        int ans = 0;
        for (int el : remArr) {
            if (el != 0)
                ans += el * (el - 1) / 2;
        }
        return ans;
    }
}
