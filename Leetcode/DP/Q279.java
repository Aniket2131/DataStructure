public class Q279 {
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }

    public static int numSquares(int n) {
        if (n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; n >= i; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; i >= j * j; j++) {
                min = Math.min(dp[i - (j*j)], min);
            }
            dp[i] = 1 + min;
        }
        return dp[n];
    }
}
