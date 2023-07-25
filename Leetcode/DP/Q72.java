public class Q72 {
    public static void main(String[] args) {
        String word1 = "Aniket", word2 = "Ankit";
        System.out.println(minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {
        int c = word2.length();
        int r = word1.length();
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
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
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
