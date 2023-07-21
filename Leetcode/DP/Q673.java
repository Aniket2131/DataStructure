public class Q673 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findNumberOfLIS(nums));
    }

    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        int maxi = 0;
        for(int i = 0; n >i; i++){
            dp[i] = 1;
            count[i] = 1;
            for(int j = 0; i > j; j++){
                if(nums[i] > nums[j] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    count[i] = count[j];
                }
                else if(nums[i] > nums[j] && dp[i] == dp[j] + 1){
                    count[i] += count[j];
                }
            }
            maxi = Math.max(maxi, dp[i]);
        }
        int ans = 0;
        for(int i = 0; n > i; i++){
            if(dp[i] == maxi){
                ans += count[i];
            }
        }
        return ans;
    }
}
