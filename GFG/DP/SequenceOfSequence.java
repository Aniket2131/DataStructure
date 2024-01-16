public class SequenceOfSequence {
    public static void main(String[] args) {
        System.out.println(numberSequence(8, 1));
    }

    static Integer[][] dp;
    public static int numberSequence(int m, int n)
    {
        // code here
        dp = new Integer[m+1][n+1];
        
        int cnt = 0;
        for(int i = 1; m >= i; i++){
            cnt += solve(i, 1, m, n);
            dp[i][1] = cnt;
        }
        return dp[m][1];
    }
    
    public static int solve(int sum, int len, int m, int n){
        if(sum > m) return 0;
        if(len == n) return 1;
        
        if(dp[sum][len] != null) return dp[sum][len];
        int cnt = 0;
        for(int i = 0; i < m; i++){
            int num = (sum*2) + i;
            cnt += solve(num, len+1, m, n);
        }
        
        return dp[sum][len] = cnt;
    }
}
