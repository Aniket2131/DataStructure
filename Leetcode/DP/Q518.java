public class Q518 {
    public static void main(String[] args) {
        int amount = 5, coins[] = {1,2,5};
        System.out.println(change(amount, coins));
    }

    public static int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        for(int i = 0; n >= i; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; n >= i; i++){
            for(int j = 1; amount >= j; j++){
                if(j >= coins[i - 1]){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
