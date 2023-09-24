public class Q799 {
    public static void main(String[] args) {
        
    }

    Double[][] dp;
    public double champagneTower(int poured, int query_row, int query_glass) {
        dp =  new Double[query_row + 1][query_row + 1];
        return Math.min(1.0 ,solve(query_row, query_glass, poured));
    }


    public double solve(int r, int c, int p) {
        if(r < c || c < 0 || r < 0) return 0;
        if(dp[r][c] != null) return dp[r][c];
        if(r == 0 && c == 0) return p; 


        double a = (solve(r-1, c-1, p) - 1.0)/2.0;

        double b = (solve(r-1, c, p) - 1.0)/2.0;
        if(a < 0) a = 0;
        if(b < 0) b = 0;

        return dp[r][c] = a+b;
    }
}
