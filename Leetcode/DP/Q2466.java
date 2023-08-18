public class Q2466 {
    public static void main(String[] args) {
        
    }

    int[] dp;
    int mod = 1000000007;

    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new int[high + 1];
        dp = new int[high + 1];
        dp[0] = 1;
        for(int i = 1; high >= i; i++){
            int sum = 0;
            if(i - zero >= 0) sum += dp[i - zero] % mod;

            if(i - one >= 0) sum += dp[i - one] % mod;

            dp[i] = sum % mod;
        }
        int ans = 0;
        for(int i = low; high >= i; i++){
            ans = (ans + dp[i] % mod) % mod;
        }
        return ans % mod;
    }

}
