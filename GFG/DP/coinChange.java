public class coinChange {
    public static void main(String[] args) {
        int N = 3, sum = 4, coins[] = {1,2,3};
        System.out.println(count(coins, N, sum));
    }

    public static long count(int coins[], int N, int sum) {
        // code here.
        long[][] dp = new long[N + 1][sum + 1];
        
        for(int i = 0; N  >= i; i++){
            dp[i][0] = 1;
        }
        
        for(int i = 1; N >= i; i++){
            for(int j = 1; sum >= j; j++){
                if(j >= coins[i - 1]){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][sum];
    }
}
