public class Q1615 {
    public static void main(String[] args) {
        int n = 4, roads[][] = {{0,1},{0,3},{1,2},{1,3}};
        System.out.println(maximalNetworkRank(n, roads));
    }

    public static int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] arr = new boolean[n][n];
        int[] sum = new int[n];
        for(int i = 0; roads.length > i; i++){
            int a = roads[i][0];
            int b = roads[i][1];
            arr[a][b] = true;
            arr[b][a] = true;
            sum[a]++;
            sum[b]++;
        }
        int ans = 0;
        for(int i = 0; n > i; i++){
            int total = 0;
            for(int j = i + 1; n > j;j++ ){
                int a = sum[i];
                int b = sum[j];
                int c = a + b;
                if(arr[i][j]) c--;
                total = Math.max(total, c);
            }
            ans = Math.max(ans, total);
        }
        return ans;
    }
}
