public class UniqueBSTs {
    public static void main(String[] args) {
        System.out.println(numTrees(5));
    }

    public static int numTrees(int N)
    {
        // Your code goes here
        return catlanNumber(N);
        
    }
    
    public static int catlanNumber(int n){
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        long mod = 1000000007;
        for(int i = 2; n >= i; i++){
            for(int j = 0; i > j; j++){
                dp[i] = ((dp[i] % mod) + (dp[j] * dp[i - j - 1])%mod)%mod;
            }
        } 
        return (int)(dp[n]%mod);
    }
}
