public class numberOfPathsInAMatrixOfKCoins {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,6,5},{3,2,1}};
        System.out.println(numberOfPath(3, 12, arr));
    }

    public static Long[][][] dp;
    public static long numberOfPath(int n, int k, int [][]arr) {
        // code here
        dp = new Long[n+1][n+1][k+1];
        return solve(arr, k, 0, 0, 0)/2;
    }
    
    public static long solve(int[][] arr, int k, int sum, int i, int j){
        if(i >= arr.length && j >= arr[0].length-1 || j >= arr.length && i >= arr.length-1){
            if(sum == k) return 1;
            return 0;
        }
        if(i >= arr.length || j >= arr[0].length){
            return 0;
        }
        
        if(sum > k) return 0;
        if(dp[i][j][sum] != null) return dp[i][j][sum];
        long a = solve(arr, k, sum+arr[i][j], i+1, j);
        
        long b = solve(arr, k, sum+arr[i][j], i, j+1);
        
        return dp[i][j][sum] = a + b;
    }
}
