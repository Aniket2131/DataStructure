public class Q2369 {
    public static void main(String[] args) {
        int[] nums = {4,4,4,5,6};
        System.out.println(validPartition(nums));
    }

    public static boolean validPartition(int[] nums) {
        int n = nums.length;
    
        return validPartition(nums, 0, new Boolean[n]);
    }

    public static boolean validPartition(int[] nums, int i, Boolean[] dp) {
        int n = nums.length;
        if(i >= n) return true;

        Boolean res = false;

        if(dp[i] != null) return dp[i];

        if(n >  i + 1 && nums[i] == nums[i + 1]){
            res |= validPartition(nums, i + 2, dp);
        }
        if(n > i + 2 &&( nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2])){
            res |= validPartition(nums, i + 3, dp);
        }
        if(n > i + 2 && (nums[i + 2] - nums[i + 1] == 1 && nums[i + 1] - nums[i] == 1)){
            res |= validPartition(nums, i + 3, dp);
        }

        return dp[i] = res;
    }
}

