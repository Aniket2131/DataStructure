public class ediDstance{
    public static void main(String[] args) {
        String s = "geek", t = "gesek";
        System.out.println(editDistance(s, t));
    }

    public static int editDistance(String s, String t) {
        // Code here
        int c = t.length();
        int r = s.length();
        int[][] dp = new int[r + 1][c + 1];
        for(int i = 0; r + 1 > i; i++){
            dp[i][0] = i;
        }
        for(int i = 0; c + 1 > i; i++){
            dp[0][i] = i;
        }
        for(int i = 1;  r + 1 > i; i++){
            for(int j = 1; c + 1 > j; j++){
                int m = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else{
                    dp[i][j] = 1 + m;
                }
            }
        }
        return dp[r][c];
    }
}