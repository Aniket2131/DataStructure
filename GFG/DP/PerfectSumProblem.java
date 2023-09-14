import java.util.Arrays;

public class PerfectSumProblem {
    public static void main(String[] args) {
        
    }

    int mod;
    int[][] dp;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	   dp = new int[n + 1][sum + 1];
	   for(int[] ar : dp){
	       Arrays.fill(ar, -1);
	   }
	   mod = 1000000007;
	   return solve(arr, n, sum)%mod;
	}
	
	public int solve(int arr[],int n, int sum){
	    if(dp[n][sum] != -1) return dp[n][sum];
        if(n == 0 && sum > 0) return 0;
        
        else if(n == 1){
            if(sum == 0){
                if(arr[0] == 0) return 2;
                else return 1;
            }
            else{
                if(arr[0] == sum) return 1;
                else return 0;
            }
        }
        else if(n == 0 && sum == 0) return 1;
        
        int ans = solve(arr, n - 1, sum)%mod;
        
        if(arr[n-1] <= sum){
            ans += solve(arr, n-1, sum - arr[n-1]);
            ans %= mod;
        }
        
        return dp[n][sum] = ans;
        
	}
}
