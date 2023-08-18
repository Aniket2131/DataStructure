public class SticklerThief{
    public static void main(String[] args) {
        int n = 5, a[] = {6,5,5,7,4};
        System.out.println(FindMaxSum(a, n));
    }

    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n == 1) return arr[0];
        
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        
        for(int i = 2; n > i; i++){
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }
}