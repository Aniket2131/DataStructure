public class recursiveSequence {
    public static void main(String[] args) {
        
    }

    static long sequence(int n){
        // code here
        long[] dp = new long[n];
        dp[0] = 1;
        long cnt = 2;
        int mod = 1000000007;
        for(int i = 1; n > i; i++){
            
            int j = i+1;
            long sum = 1;
            while(j > 0){
                sum = (sum%mod * cnt%mod)%mod;
                cnt++;
                j--;
            }
            
            dp[i] = (dp[i-1]%mod + sum%mod)%mod;
        }
        
        return dp[n-1];
    }
}
