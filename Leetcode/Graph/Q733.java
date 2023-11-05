public class Q733{
    public static void main(String[] args) {
        
    }

    int n, m, sco;
    boolean[][] v;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        n = image.length;
        m = image[0].length;
        v = new boolean[n][m];
        sco = image[sr][sc];
        solve(image, sr, sc, color);
        return image;
    }

    public void solve(int[][] img, int sr, int sc, int co){
        if(sr < 0 || sr >= n || sc < 0 || sc >= m) return;

        if(v[sr][sc]) return;
        if(img[sr][sc] == sco) img[sr][sc] = co;
        else return;

        v[sr][sc] = true; 

        solve(img, sr-1, sc, co);

        solve(img, sr+1, sc, co);

        solve(img, sr, sc-1, co);

        solve(img, sr, sc+1, co);
    } 
}