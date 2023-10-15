public class Q1269 {
    public static void main(String[] args) {
        
    }

    int n;
    Integer[][] dp;
    int mod;
    public int numWays(int steps, int arrLen) {
        arrLen = Math.min(arrLen, steps);
        n = arrLen;
        mod = 1000000007;
        dp = new Integer[steps+1][n+1];
        return solve(steps, 0);
    }

    public int solve(int s, int pos){
        if(s == 0) return pos == 0 ? 1: 0;

        if(pos < 0 || pos >= n) return 0;

        if(dp[s][pos] != null) return dp[s][pos]%mod;

        int l = solve(s-1, pos-1)%mod; 

        int st = solve(s-1, pos)%mod;

        int r = solve(s-1, pos+1)%mod;

        return dp[s][pos] = ((l+st)%mod + r)%mod;
    }
}
