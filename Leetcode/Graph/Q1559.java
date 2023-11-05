public class Q1559 {
    public static void main(String[] args) {
        
    }

    int n, m;
    boolean[][] v;
    public boolean containsCycle(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        v = new boolean[n][m];
        for(int i = 0; n > i; i++){
            for(int j = 0; m > j; j++){
                if(!v[i][j]){
                    boolean f = solve(grid, i, j, grid[i][j], -1, -1);
                    if(f) return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] grid, int i, int j, char ch, int lr, int lc){
        if(i < 0 || i >= n || j < 0 || j >= m) return false;
        if(grid[i][j] != ch) return false;
        if(grid[i][j] == ch){
            if(v[i][j] == true) return true;
            else{
                v[i][j] = true;

            }
        }
        boolean f = false;
        if(i + 1 != lr){
            f |= solve(grid, i + 1, j, grid[i][j], i, j); 
        }
        // if(f) return true;
        if(i - 1 != lr){
            f |= solve(grid, i - 1, j, grid[i][j], i, j); 
        }
        // if(f) return true;
        if(lc != j+1){
            f |= solve(grid, i, j+1, grid[i][j], i, j); 
        }
        // if(f) return true;
        if(lc != j-1){
            f |= solve(grid, i, j-1, grid[i][j], i, j); 
        }
        return f;
    }
}
