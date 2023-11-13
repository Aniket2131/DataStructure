public  class shortedtCommonSubsequence {
    public static void main(String[] args) {
        
    }

    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        int[][] dp = new int[m+1][n+1];
        for(int i = m-1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                char ch1 = X.charAt(i);
                char ch2 = Y.charAt(j);
                if(ch1 == ch2){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return m + n - dp[0][0];
    }
    
}
