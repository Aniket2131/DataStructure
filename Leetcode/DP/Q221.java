public class Q221 {
    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'}, {'1','0','1','1','1'}, {'1','1','1','1','1'}, {'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix));
    }

    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        for(int i = 0; n > i; i++){
            if(matrix[m - 1][i] == '0'){
                dp[m - 1][i] = 0;
            }
            else{
                dp[m - 1][i] = 1;
                ans = Math.max(ans, dp[m - 1][i]);
            }
        }
        for(int i = 0; m > i; i++){
            if(matrix[i][n - 1] == '0'){
                dp[i][n - 1] = 0;
            }
            else{
                dp[i][n - 1] = 1;
                ans = Math.max(ans, dp[i][n - 1]);
            }
        }
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                if(matrix[i][j] == '0'){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i][j + 1] , Math.min(dp[i + 1][j], dp[i + 1][j + 1]));
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans * ans;
}
}