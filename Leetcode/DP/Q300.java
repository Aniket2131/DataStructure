public class Q300{
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int ans = Integer.MIN_VALUE;
        for(int i = 0; n > i; i++){
            int num = 0;
            for(int j = 0; i > j; j++){
                if(nums[i] > nums[j]){
                    num = Math.max(num, dp[j]);
                }
            }
            dp[i] = num + 1;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}