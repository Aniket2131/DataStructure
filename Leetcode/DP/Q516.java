public class Q516{
    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("aba"));
    }

    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int g = 0; n > g; g++){
            for(int i = 0, j = g; n > j; i++, j++){
                if(g == 0){
                    dp[i][j] = 1;
                }
                else if(g == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 2: 1; 
                }
                else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    }
                    else{
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}