import java.util.LinkedList;
import java.util.Queue;

public class atiDiagnoalTraversalOfMatrix {
    public static void main(String[] args) {
        
    }

    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        int n = matrix.length;
        boolean[][] v = new boolean[n][n];
        int[] ans = new int[n * n];
        int i = 0;
        q.add(new int[]{0, 0});
        v[0][0] = true;
        
        while(!q.isEmpty()){
            
            int[] ar = q.poll();
            int r = ar[0], c = ar[1];
            ans[i++] = matrix[r][c];
            
            if(c + 1 < n && v[r][c+1] == false){
                v[r][c+1] = true;
                q.add(new int[]{r, c+1});
            }
            if(r + 1 < n && v[r+1][c] == false){
                v[r+1][c] = true;
                q.add(new int[]{r+1, c});
            }
            
        }
        
        return ans;
    }
}
