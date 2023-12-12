import java.util.Arrays;

public class goldMineProblem{
    public static void main(String[] args) {
        
    }

    static int[][] dp;
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int ans = Integer.MIN_VALUE;
        dp = new int[n+1][m+1];
        
        for(int[] ar: dp) Arrays.fill(ar, -1);
        
        for(int i = 0; n > i; i++){
            dp[i][0] = solve(M, i, 0);
            ans = Math.max(ans, dp[i][0]);
        }
        return ans;
    }
    
    static int solve(int[][] arr, int r, int c){
        
        if(r < 0 || c < 0 || r >= arr.length || c >= arr[0].length) return 0;
        
        if(dp[r][c] != -1) return dp[r][c];
        
        return dp[r][c] = arr[r][c] + Math.max(Math.max(solve(arr, r-1, c+1), solve(arr, r+1, c+1)), solve(arr, r, c+1));
    }
}