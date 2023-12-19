public class Q661{
    public static void main(String[] args) {
        
    }

    public static int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ans = new int[m][n];
        int[] r = {-1, 1, 0,  0, -1, -1, 1, 1};
        int[] c = {0,  0, -1, 1, -1,  1, -1, 1};
        for(int i = 0; m > i; i++){
            for(int j = 0; n > j; j++){
                int cnt = 1, sum = 0;
                for(int k = 0; 8 > k; k++){
                    int nr = i + r[k], nc = j + c[k];

                    if(nr >= 0 && nr < m && nc >= 0 && nc < n){
                        cnt++;
                        sum += img[nr][nc];
                    }
                }
                sum += img[i][j];
                ans[i][j] = sum / cnt;
            }
        }

        return ans;
    }
}