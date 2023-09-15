import java.util.Arrays;

public class PartitionEqualSubsetSum{
    public static void main(String[] args) {
        int[] arr = {2, 4, 11, 10, 5};
        System.out.println(equalPartition(arr.length, arr));
    }

    static int[][] dp;
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int el : arr){
            sum += el;
        }
        
        if(sum % 2 != 0) return 0;
        dp = new int[N+1][sum];
        for(int[] ar: dp){
            Arrays.fill(ar, -1);
        }
        return solve(arr, 0, sum/2, 0);
    }

    static int solve(int[] arr, int ind, int sum, int curSum){
        if(ind >= arr.length) return 0;
        
        if(dp[ind][curSum] != -1) return dp[ind][curSum];
        
        if(curSum == sum) return 1;
        
        int ans = 0;
        
        ans = solve(arr, ind+1, sum, curSum+arr[ind]);
        
        if(ans == 1) return dp[ind][curSum] = 1;
        
        ans = solve(arr, ind+1, sum, curSum);
        
        return dp[ind][curSum] = ans;
    }
}