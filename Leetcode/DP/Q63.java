public class Q63 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0}, {0,1,0},{0,1,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; m > i; i++){
            for(int j = 0; n > j; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;
                if(i > 0) up = dp[i - 1][j];
                if(j > 0) left = dp[i][j - 1];
                dp[i][j] = up + left;
            }
        }
        return dp[m -1][n -1];
    }
}
