public class Q7 {
    public static void main(String[] args) {

    }

    public static long minimumBuckets(int N, int arr[]) {
        // Code here.
        int result = arr[0];
        for (int element : arr) {
            result = gcd(result, element);
        }
        long cnt = 0;
        for (int el : arr) {
            cnt += (el / result);
        }
        return cnt;
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
