public class Q322 {
    public static void main(String[] args) {
        int coins[] = {1,2,5}, amount = 11;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        if(1 > amount) return 0;
        int[] dp = new int[amount + 1];

        for(int i = 1; amount >= i; i++){

            dp[i] = Integer.MAX_VALUE;
            for(int j = 0; coins.length > j; j++){
                if(i >= coins[j] && dp[i - coins[j]] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE? -1 : dp[amount];
    }
}
