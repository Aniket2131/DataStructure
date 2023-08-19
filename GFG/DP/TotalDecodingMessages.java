public class TotalDecodingMessages{
    public static void main(String[] args) {
        String str = "123";
        System.out.println(CountWays(str));
    }

    public static int CountWays(String str)
    {
        // code here
        int mod = 1000000007;
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = str.charAt(n - 1) != '0'? 1: 0;
        for(int i = n - 2; i >= 0; i--){
            if(str.charAt(i) == '0') continue;
            else{
                int ans = dp[i + 1];
                if(i < str.length() - 1 && Integer.parseInt(str.substring(i, i + 2)) < 27){
                    ans += dp[i + 2] % mod;
                }
                dp[i] = ans % mod;
            }
        }
        return dp[0] % mod;
    }
}