public class Q64 {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 1; m > i; i++){
            grid[0][i] += grid[0][i-1];
        }

        for(int i = 1; n > i; i++){
            grid[i][0] += grid[i-1][0];
        }

        for(int i = 1; n > i; i++){
            for(int j = 1; m > j; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        
        return grid[n-1][m-1];
    }
}
