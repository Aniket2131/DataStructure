public class Q1312{
    public static void main(String[] args) {
        String s = "mbadm";
        System.out.println(minInsertions(s));
    }

    public static int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int g = 1; n > g; g++){
            for(int i = 0, j = g; n > j; i++, j++){
                if(s.charAt(i) == s.charAt(j)){
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