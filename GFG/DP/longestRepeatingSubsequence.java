public class longestRepeatingSubsequence {
    public static void main(String[] args) {
        String str = "axxzxy";
        System.out.println(LongestRepeatingSubsequence(str));
    }

    public static int LongestRepeatingSubsequence(String str)
    {
        // code here
        int[][] dp = new int[str.length() + 1][str.length() + 1];
        for(int i = dp.length - 2; i >= 0; i--){
            for(int j = dp[0].length - 2; j >= 0; j--){
                char c1 = str.charAt(i);
                char c2 = str.charAt(j);
                if(c1 == c2 && i != j){
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                }
                else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
}
