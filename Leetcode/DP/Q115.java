public class Q115 {
    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        System.out.println(numDistinct(s, t));
    }

    public static int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 0; n >= i; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; m >= i; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; n >= i; i++){
            for(int j = 1; m >= j; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][m];
    }
}
