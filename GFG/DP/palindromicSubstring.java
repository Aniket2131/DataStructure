public class palindromicSubstring {
    public static void main(String[] args) {
        
    }

    static int palindromicPartition(String str)
    {
        // code here
        int n = str.length();
        boolean[][] booldp = new boolean[n][n];
        for(int g = 0; n > g; g++){
            for(int i = 0, j = g; j < n; j++, i++){
                if(g == 0) booldp[i][j] = true;
                
                else if(g == 1){
                    if(str.charAt(i) == str.charAt(j)) booldp[i][j] = true;
                    else booldp[i][j] = false;
                }
                else{
                    if(str.charAt(i) == str.charAt(j)){
                        if(booldp[i+1][j-1]) booldp[i][j] = true;
                        else booldp[i][j] = false;
                    }
                    else booldp[i][j] = false;
                }
            }
        }
        
        int[] dp = new int[n];
        for(int i = 1; n > i; i++){
            if(!booldp[0][i]){
                int min = Integer.MAX_VALUE;
                for(int j = i; j >= 1; j--){
                    if(booldp[j][i]){
                        if(dp[j-1] < min) min = dp[j-1];
                }
            }
            dp[i] = min + 1;    
            }
        }
        return dp[n-1];
    }
}
