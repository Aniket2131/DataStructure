public class Distinctoccurrences {
    public static void main(String[] args) {
        String S = "banana" , T = "ban";
        System.out.println(subsequenceCount(S, T));
    }

    public static int  subsequenceCount(String S, String T)
    {
	// Your code here	
	    int n = S.length();
	    int m = T.length();
	    int mod = 1000000007;
	    int[][] dp = new int[n + 1][m + 1];
	    for(int i = 0; n >= i; i++){
	        dp[i][0] = 1;
	    }
	    for(int i = 1; n >= i; i++){
	        for(int j = 1; m >= j; j++){
	            if(S.charAt(i - 1) == T.charAt(j - 1)){
	                dp[i][j] = ((dp[i - 1][j - 1])%mod + (dp[i - 1][j])%mod) % mod;
	            }
	            else{
	                dp[i][j] = (dp[i - 1][j])% mod;
	            }
	        }
	    }
	    return dp[n][m] % mod;
    }
}
