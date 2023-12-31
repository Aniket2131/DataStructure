public class newYearResolution {
    public static void main(String[] args) {
        
    }

    static Boolean[][] dp;
    public static boolean isPossible(int N, int[] coins) {
        // code here
        dp = new Boolean[N+1][2027];
        return solve(coins, 0, 0);
    }
    
    public static boolean solve(int[] c, int ind, int sum){
        
        if(ind >= c.length){
            if((sum % 4 == 0 && sum % 5 == 0 && sum >= 20) || (sum >= 24 && sum % 3 == 0 && sum % 8 == 0) || sum == 2024) return true;
            
            return false;
        }
        
        if(dp[ind][sum] != null) return dp[ind][sum];
        
        boolean a = solve(c, ind+1, sum + c[ind]);
        
        boolean b = solve(c, ind+1, sum);
        
        return dp[ind][sum] = a || b;
    }
}
