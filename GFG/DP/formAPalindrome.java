public class formAPalindrome {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(countMin(str));
    }

    public static int countMin(String str)
    {
        // code here
        int n = str.length();
        int[][] dp = new int[n][n];
        for(int g = 1; n > g; g++){
            for(int i = 0, j = g; n > j; i++, j++){
                if(str.charAt(i) == str.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
