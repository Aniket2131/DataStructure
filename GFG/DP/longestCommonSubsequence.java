public class longestCommonSubsequence{
    public static void main(String[] args) {
        String str1 = "ABCDGH",str2 = "AEDFHR";
        System.out.println(lcs(str1.length(), str2.length(), str1, str2));
    }

    public static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int i = dp.length - 2; i >= 0; i--){
            for(int j = dp[0].length - 2; j >= 0; j--){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(j);
                if(c1 == c2){
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
}