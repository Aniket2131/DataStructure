import java.util.Arrays;

public class Countnumberofhops {
    public static void main(String[] args) {
        
    }

    static int mod;
    static long[] dp;
    static long countWays(int n)
    {
        // add your code here
        mod = 1000000007;
        dp = new long[n + 1];
        Arrays.fill(dp, -1);
        return solve(0, n)%mod;
    }
    
    static long solve(int cnt, int n){
        if(cnt > n) return 0;
        
        if(dp[cnt] != -1) return dp[cnt];
        
        if(cnt == n) return 1;
        
        long ans = 0;
        
        if(cnt + 1 <= n){
            ans += solve(cnt + 1, n);
            ans %= mod;
        }
        
        if(cnt + 2 <= n){
            ans += solve(cnt + 2, n);
            ans %= mod;
        }
        
        if(cnt + 3 <= n){
            ans += solve(cnt + 3, n);
            ans %= mod;
        }
        
        return dp[cnt] = ans;
    }
}
