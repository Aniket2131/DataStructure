public class longestPalindromeInAString{
    public static void main(String[] args) {
        String S = "aaaabbaa";
        System.out.println(longestPalin(S));

    }

    public static String longestPalin(String S){
        // code here
        String s = S;
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        int r = 0;
        int c = 0;
        int len = Integer.MIN_VALUE;
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
                if(dp[i][j] && j - i > len){
                    r = i;
                    c = j;
                    len = j - i;
                }
            }
        }
        return s.substring(r, c + 1);
        
    }
}