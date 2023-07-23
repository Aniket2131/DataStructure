public class largestSquareFormedInAMatrix{
    public static void main(String[] args) {
        int n = 2, m = 2,
        mat[][] = {{1, 1}, 
                {1, 1}};

       System.out.println(maxSquare(n, m, mat));         
    }

    public static int maxSquare(int n, int m, int mat[][]){
        // code here
        m = mat.length;
        n = mat[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        for(int i = 0; n > i; i++){
            dp[m - 1][i] = mat[m - 1][i];
            ans = Math.max(ans, dp[m - 1][i]);
        }
        for(int i = 0; m > i; i++){
            dp[i][n - 1] = mat[i][n - 1];
            ans = Math.max(ans, dp[i][n - 1]);
        }
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                if(mat[i][j] == 0){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i][j + 1] , Math.min(dp[i + 1][j], dp[i + 1][j + 1]));
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}