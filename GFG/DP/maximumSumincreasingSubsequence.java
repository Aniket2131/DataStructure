public class maximumSumincreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 2};
        System.out.println(maxSumIS(arr, arr.length));
    }

    public static int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int ans = 0;
	    int[] dp = new int[n+1];
	    for(int i = 0; n > i; i++){
            dp[i] = arr[i];
	        int sum = 0;
	        for(int j = 0; j < i; j++){
	            if(arr[j] < arr[i]){
	                sum = Math.max(dp[j]+arr[i], sum);
	            }
	        }
	        if(i == 0) dp[0] = arr[i];
            dp[i] = Math.max(sum, dp[i]);
	        ans = Math.max(ans, dp[i]);
	    }
	    return ans;
	}  
}
