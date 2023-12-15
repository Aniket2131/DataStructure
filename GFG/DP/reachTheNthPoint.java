public class reachTheNthPoint {
    public static void main(String[] args) {
        
    }

    Integer[] dp;
    int m = 1000000007;
    public int nthPoint(int n)
    {
        // Code here
        dp = new Integer[n+1];
        if(n <= 3) return n;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; n >= i; i++){
            dp[i] = ((dp[i-1]%m) + (dp[i-2]%m)%m);
        }
        
        return dp[n]%m;
    }
}
