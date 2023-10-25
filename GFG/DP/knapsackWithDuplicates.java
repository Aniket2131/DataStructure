public class knapsackWithDuplicates {
    public static void main(String[] args) {
        
    }

    static Integer[][] dp;
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        dp = new Integer[N+1][W+1];
        return solve(val, wt, 0, W);
    }
    
    static int solve(int[] val, int[] wt, int ind, int w){
        if(ind >= val.length) return 0;
        
        if(w <= 0) return 0;
        
        if(dp[ind][w] != null) return dp[ind][w];
        
        int take = 0;
        if(w - wt[ind] >= 0){
            take = val[ind] + solve(val, wt, ind, w-wt[ind]);
        }
        
        int ntake = solve(val, wt, ind+1, w);
        
        return dp[ind][w] = Math.max(take, ntake);
    }  
}
