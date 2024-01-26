public class Q576{
    public static void main(String[] args) {
        System.out.println(findPaths(2, 2, 2, 0, 0));
    }

    static int[] r = {-1, 1, 0,  0};
    static int[] c = {0,  0, -1, 1};
    static int mod;
    static Integer[][][] dp;
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        mod = 1000000007;
        dp = new Integer[51][51][51];
        return solve(m, n, startRow, startColumn, maxMove);
    }

    public static int solve(int m, int n, int s, int e, int move){
        if(s < 0 || s >= m || e < 0 || e >= n){
            if(move >= 0) return 1;
            return 0;
        }

        if(dp[s][e][move] != null) return dp[s][e][move];

        if(move <= 0) return 0;

        int sum = 0;
        for(int i = 0; 4 > i; i++){
            int nr = s + r[i], nc = e + c[i];
            sum = ((sum % mod) + (solve(m, n, nr, nc, move-1)%mod))%mod;
        }

        return dp[s][e][move] = sum%mod;
    }
}