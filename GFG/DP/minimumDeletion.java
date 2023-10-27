public class minimumDeletion {
        public static void main(String[] args) {
            
        }

        static Integer[][] dp;
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n = S.length();
        dp = new Integer[n+1][n+1];
        return solve(S, 0, n-1);
    }
    
    static int solve(String s, int l, int h){
        if(h < l) return 0;
        
        if(dp[l][h] != null) return dp[l][h];
        
        char ch1 = s.charAt(l);
        char ch2 = s.charAt(h);
        
        int a = Integer.MAX_VALUE;
        if(ch1 == ch2) a = solve(s, l+1, h-1);
        
        else{
            int b = 1 + solve(s, l+1, h);
            int c = 1 + solve(s, l, h-1);
            a = Math.min(a, Math.min(b, c));
        }
        
        return dp[l][h] = a;
    }
}
