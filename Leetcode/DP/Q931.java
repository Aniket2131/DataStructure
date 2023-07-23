public class Q931 {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3}, {6,5,4}, {7,8,9}};
        System.out.println(minFallingPathSum(matrix));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] cur = new int[n - 1][n];
        int[][] pre = new int[n][n];
        for(int i = 0; n > i; i++){
            pre[n - 1][i] = matrix[n - 1][i];
        }
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; n > j; j++){
                cur[i][j] = pre[i+1][j];
                if(n > i + 1 && j - 1 >= 0){
                    cur[i][j] = Math.min(pre[i + 1][j - 1], cur[i][j]);
                }
                if(n > i + 1 && n > j + 1){
                    cur[i][j] = Math.min(pre[i + 1][j + 1], cur[i][j]);
                }
                cur[i][j] += matrix[i][j];
            }
            pre = cur;
            cur = new int[n - 1][n];
        }

        int ans = Integer.MAX_VALUE;
        for(int j = 0; n > j; j++){
            ans = Math.min(ans, pre[0][j]);
        }
        
        return ans;
    }
}
