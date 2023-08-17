public class Q188 {
    public static void main(String[] args) {
        int k = 2, prices[] = {3,2,6,5,0,3};
        System.out.println(maxProfit(k, prices));
    }

    public static int maxProfit(int k, int[] prices) {
        int c = prices.length;
        if(c == 1) return 0;
        int[][] dp = new int[k + 1][c];
        for(int i = 1; k >= i; i++){
            for(int j = 1; c > j; j++){
                int max = dp[i][j - 1];
                for(int l = 0; j > l; l++){
                    max = Math.max(max, dp[i - 1][l] + (prices[j] - prices[l]));
                }
                dp[i][j] = max;
            }
        }
        return dp[k][c - 1];
    }
}
