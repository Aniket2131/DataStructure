public class grindingGeeks {
    public static void main(String[] args) {
        // int n = 11, total = 10;
        // int[] cost = {10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int n = 2, total = 10;
        int[] cost = {10, 9};
        System.out.println(max_courses(n, total, cost));
    }

    static Integer[][] dp;
    public static int max_courses(int n, int total, int[] cost) {
        // code here
        dp = new Integer[n][total+1];
        return solve(total, 0, cost);
    }
    
    public static int solve(int t, int ind, int[] c){
        if(ind == c.length) return 0;
        
        if(dp[ind][t] != null) return dp[ind][t];
        
        int take = Integer.MIN_VALUE;
        if(t >= c[ind]){
            int l = t - c[ind];
            int per90 = (90 * c[ind]) / 100;
            take = 1 + solve(per90+l, ind+1, c);
        }
        
        int ntake = solve(t, ind+1, c);
        
        return dp[ind][t] = Math.max(take, ntake);
    }
}
