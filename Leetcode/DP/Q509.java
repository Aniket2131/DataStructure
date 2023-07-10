public class Q509 {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }

    public static int fib(int n) {
        int[] arr = new int[n + 1];

        return fib(n, arr);
    }

    public static int fib(int n, int[] arr) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        if(arr[n] != 0) return arr[n];
        return arr[n] = fib(n - 1) + fib(n - 2);
    }
}
