public class wildCarStringMatching {
    public static void main(String[] args) {
        
    }

    static boolean match(String wild, String pattern)
    {
        // code here
        int n = wild.length(), m = pattern.length();
        
        int[][] dp = new int[n+1][m+1];
        dp[n][m] = 1;
        
        for(int i = n-1; i >= 0; i--){
            
            for(int j = m - 1; j >= 0; j--){
                
                char ch1 = wild.charAt(i), ch2 = pattern.charAt(j);
                
                if(ch1 == ch2 && dp[i+1][j+1] == 1) dp[i][j] = 1;
                
                if(ch1 == '?' && dp[i+1][j+1] == 1) dp[i][j] = 1;
                
                if(ch1 == '*' && (dp[i+1][j+1] == 1 || dp[i][j+1] == 1)) dp[i][j] = 1;
                
            }
            
        }
        
        return dp[0][0] == 0 ? false: true;
    }
}
