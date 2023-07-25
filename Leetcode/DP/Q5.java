public class Q5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        int r = 0;
        int c = 0;
        for(int g = 0; n > g; g++){
            for(int i = 0, j = g; n > j; i++, j++){
                if(g == 0){
                    dp[i][j] = true;
                }
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                    else dp[i][j] = false;
                }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true ){
                        dp[i][j] = true;
                    }
                    else{
                      dp[i][j] = false;   
                    }
                }
                if(dp[i][j]){
                    r = i;
                    c = j;
                }
            }
        }
        return s.substring(r, c + 1);
    }
}
