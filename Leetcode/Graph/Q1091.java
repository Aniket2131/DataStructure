public class Q1091 {
    public static void main(String[] args) {
        
    }

    class tuple {

        int row;
        int col;
        int lev;

        tuple(int row, int col, int lev){
            this.row = row;
            this.col = col;
            this.lev = lev;
        }

    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[] r = {-1, 1, 0, 0,  -1, -1, 1, 1};
        int[] c = {0,  0, -1, 1, -1, 1,  -1, 1};

        if(grid[0][0] == 1) return -1;

        Queue<tuple> q = new LinkedList<>();
        int n = grid.length, m = grid[0].length;
        boolean[][] v = new boolean[n + 1][m + 1];
        q.add(new tuple(0, 0, 1));
        v[0][0] = true;
        while(!q.isEmpty()){

            tuple temp = q.poll();
            int ro = temp.row;
            int co = temp.col;
            int lev = temp.lev;
            if(ro == grid.length-1 && co == grid[0].length-1) return lev;

            for(int i = 0; 8 > i; i++){
                int nr = ro + r[i];
                int nc = co + c[i];

                if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0 && v[nr][nc] == false){
                    q.add(new tuple(nr, nc, lev+1));
                    v[nr][nc] = true;
                }
            }
        }

        return -1;
    }
}
