// To understand the formula make patterns till 5 

public class Q790 {
    public static void main(String[] args) {
        System.out.println(numTilings(6));
    }

    public static int numTilings(int n) {
        if(n == 1 || n == 2) return n;
        int[] dp = new int[n  + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        int mod = 1000000007;
        for(int i = 4; n >= i; i++){
            dp[i] = ((2 * dp[i - 1])%mod + dp[i - 3]) % mod;
        }
        return dp[n];
    }
}
