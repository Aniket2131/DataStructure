public class Q1027 {
    public static void main(String[] args) {
       int[] nums = {3,6,9,12};
       System.out.println(longestArithSeqLength(nums)); 
    }

    public static int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if(n == 2) return 2;
        int ans = 2;
        int[][] dp = new int[n][1003];
        for(int i = 1; n > i; i++){
            for(int j = 0; i > j; j++){
                int d = (nums[i] - nums[j]) + 501;
                dp[i][d] = dp[j][d] > 0 ? dp[j][d] + 1: 2;
                ans = Math.max(ans, dp[i][d]);
            }
        }
        return ans;
    }
}
