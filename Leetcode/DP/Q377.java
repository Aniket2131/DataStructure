import java.util.Arrays;

public class Q377 {
    public static void main(String[] args) {
        int nums[] = {1,2,3}, target = 4;
        System.out.println(combinationSum4(nums, target));
    }

    public static int[] dp;
    public static int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        return helper(nums, target);
    }

    public static int helper(int[] nums, int sum){
        if(0 > sum) return 0;

        if(sum == 0) return 1;

        if(dp[sum] != -1) return dp[sum];

        int ans = 0;

        for(int i = 0; nums.length > i; i++){
            ans += helper(nums, sum - nums[i]);
        }

        return dp[sum] = ans;
    }
}
