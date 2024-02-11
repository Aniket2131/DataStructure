public class Q1463 {
    public static void main(String[] args) {
        int[][] grid = {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        System.out.println(cherryPickup(grid));
    }

    static Integer[][][] dp;

    public static int cherryPickup(int[][] grid) {
        dp = new Integer[grid.length+1][grid[0].length][grid[0].length];
        return solve(grid, 0, 0, grid[0].length-1);
    }

    public static int solve(int[][] grid, int r, int r1, int r2){
        if(r1 < 0 || r2 < 0 || r1 >= grid[0].length || r2 >= grid[0].length) return 0;
        if(dp[r][r1][r2] != null) return dp[r][r1][r2];

        if(r == grid.length) return 0;

        int ans = grid[r][r1] + grid[r][r2];
        int max = 0;
        for(int x=r1-1;x<=r1+1;x++) {
            for(int y=r2-1;y<=r2+1;y++) {
                if(x < y) { 
                    max = Math.max(max, solve(grid, r+1, x, y));
                }
            }
        }

        return dp[r][r1][r2] = max+ans;
    }
}
