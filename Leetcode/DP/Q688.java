public class Q688{
    public static void main(String[] args) {
        int n = 3, k = 2, row = 0, column = 0;
        System.out.println(knightProbability(n, k, row, column));
    }

    public static boolean isValid(int r, int c, int n){
        if(r >= 0 && c >= 0 && n > r && n > c){
            return true;
        }
        return false;
    }
    public static double knightProbability(int n, int k, int row, int column) {
        double[][] cur = new double[n][n];
        double[][] next = new double[n][n];
        cur[row][column] = 1;
        int[] r = {-2, -2, -1, -1, 1, 2,  2,   1};
        int[] c = {1,  -1, -2,  2, 2, 1, -1, -2}; 
        for(int m = 0; k > m; m++){
            for(int i = 0; n > i; i++){
                for(int j = 0; n > j; j++){
                    if(cur[i][j] != 0){
                        for(int ind = 0; 8 > ind; ind++){
                            if(isValid(i + r[ind], j + c[ind], n)){
                                next[i + r[ind]][j + c[ind]] += cur[i][j]/8;
                            }
                        }
                    }
                }
            }
            cur = next;
            next = new double[n][n];
        }

        double ans = 0;
        for(int i = 0; n > i; i++){
            for(int j = 0; n > j;j++){
                ans += cur[i][j];
            }
        }
        return ans;
    }
}