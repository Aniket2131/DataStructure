public class countDigitGroupingOfANumber{
    public static void main(String[] args) {
        System.out.println(TotalCount("1119"));
    }

    static Integer[][] dp;
    public static int TotalCount(String str)
    {
        // Code here
        dp = new Integer[str.length()][901];
        
        return solve(0, 0, str);
    }
    
    public static int solve(int ind, int t, String s){
        if(s.length() <= ind) return 1;
        if(dp[ind][t] != null) return dp[ind][t];
        
        int sum = 0;
        int ans = 0;
        for(int i = ind; s.length() > i; i++){
            int num = Integer.parseInt(s.charAt(i) + "");
            sum += num;
            if(sum >= t){
                ans += solve(i+1, sum, s);
            }
        }
        return dp[ind][t] = ans;
    }
}