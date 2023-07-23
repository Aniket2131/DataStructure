public class maximumPathSumInMatrix{
    public static void main(String[] args) {
        int[][] Matrix = {{348, 391},
          {618, 193}};
        System.out.println(maximumPath(Matrix.length, Matrix));  
    }

    public static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int[][] cur = new int[N - 1][N];
        int[][] pre = new int[N][N];
        for(int i = 0; N > i; i++){
            pre[N-1][i] = Matrix[N-1][i];
        }
        
        for(int i = N - 2; i >= 0; i--){
            for(int j = 0; N > j; j++){
                cur[i][j] = pre[i + 1][j];
                if(N > i + 1 && j - 1 >= 0){
                    cur[i][j] = Math.max(cur[i][j],  pre[i + 1][j - 1]);
                }
                if(N > i + 1 && N > j + 1 ){
                    cur[i][j] = Math.max(cur[i][j],  pre[i + 1][j + 1]);
                }
                cur[i][j] += Matrix[i][j];
            }
            pre = cur;
            cur = new int[N - 1][N];
        }
        
        int ans = Integer.MIN_VALUE;
        for(int i = 0; N > i; i++){
            ans = Math.max(ans, pre[0][i]);
        }
        return ans;
    }
}