public class Q62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        return uniquePaths(m-1, n-1, dp);
    }

    public static int uniquePaths(int m, int n, int[][] dp){
        if(m == 0 && n == 0){
            return 1;
        }
        if(0 > m) return 0;
        if(0 > n) return 0;

        if(dp[m][n] != 0) return dp[m][n];

        return dp[m][n] = uniquePaths(m-1, n, dp) + uniquePaths(m, n-1, dp);
    }
}
