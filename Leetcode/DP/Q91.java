public class Q91 {
    public static void main(String[] args) {
        String s = "27";
        System.out.println(numDecodings(s));
    }

    public static int[] dp;

    public static int numDecodings(String s) {
        int n = s.length();
        dp = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = s.charAt(n - 1) != '0'? 1: 0;
        for(int i = n - 2; i >= 0; i--){
            if(s.charAt(i) == '0') continue;
            else{
                int ans = dp[i + 1];
                if(i < s.length() - 1 && Integer.parseInt(s.substring(i, i + 2)) < 27){
                    ans += dp[i + 2];
                }
                dp[i] = ans;
            }
        }
        return dp[0];
    }
}
