public class Q935 {
    public static void main(String[] args) {
        
    }

    int[] ro = {-2, -2, 2, 2, -1, 1, -1, 1};
    int[] co = {-1, 1, -1, 1, -2, -2, 2, 2};
    int mod = 1000000007;
    Integer[][][] dp;
    public int knightDialer(int n) {    
        int ans = 0;
        dp = new Integer[5][4][n+1];

        if(n == 1) return 10;

        for(int i = 0; 4 > i; i++){

            for(int j = 0; j < 3; j++){

                if((i == 3 && j == 0) || (i == 3 && j == 2)) continue;

                ans = ((ans % mod) + (solve(i, j, n-1)%mod))%mod;
            }
        }

        return ans;
    }

    public int solve(int r, int c, int n){

        if(n == 0) return 1;
        if(dp[r][c][n] != null) return dp[r][c][n];
        int ans = 0;

        for(int k = 0; 8 > k; k++){

            int nr = r + ro[k];
            int nc = c + co[k];

            if((nr == 3 && nc == 0) || (nr == 3 && nc == 2)) continue;
            if(nr >= 0 && nc >= 0 && nr < 4 && nc < 3){
                ans = (ans + (solve(nr, nc, n-1)%mod))%mod;
            }

        }

        return dp[r][c][n] = ans%mod;
    }
}
