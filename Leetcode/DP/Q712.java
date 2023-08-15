public class Q712 {
    public static void main(String[] args) {
        String s1 = "sea", s2 = "eat";
        System.out.println(minimumDeleteSum(s1, s2));
    }

    public static int minimumDeleteSum(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        dp[n1][n2] = 0;
        for(int i = n1 - 1; i >= 0; i--){
            dp[i][n2] = (int) s1.charAt(i) + dp[i + 1][n2];
        }
        for(int i = n2 - 1; i >= 0; i--){
            dp[n1][i] = (int) s2.charAt(i) + dp[n1][i + 1];
        }
        for(int i = n1 - 1; i >= 0; i--){
            for(int j = n2 - 1; j >= 0; j--){
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);
                if(ch1 == ch2){
                    dp[i][j] = dp[i + 1][j + 1];
                }
                else{
                    dp[i][j] = Math.min(ch1 + dp[i + 1][j], ch2 + dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
}
