public class longestPalindromicSubsequence {
    public static void main(String[] args) {
        String S = "aba";
        System.out.println(longestPalinSubseq(S)); 
    }

    public static int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length();
        int[][] dp = new int[n][n];
    
        for(int g = 0; n > g; g++){
            for(int i = 0, j = g; n > j;i++, j++){
                if(g == 0){
                    dp[i][j] = 1;
                }
                else if(g == 1){
                    dp[i][j] = S.charAt(i) == S.charAt(j) ? 2 : 1;
                }
                else{
                    if(S.charAt(i) == S.charAt(j)){
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
