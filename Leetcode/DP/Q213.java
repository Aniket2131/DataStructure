public class Q213{
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if(2 > n) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int[] firstInclude = new int[n - 1];
        int[] lastInclude = new int[n - 1];
        for(int i = 0; n - 1 > i; i++){
            firstInclude[i] = nums[i];
            lastInclude[i] = nums[i + 1]; 
        }

        int a = helper(firstInclude, n - 1);
        int b = helper(lastInclude, n - 1);

        return Math.max(a, b);
    }

    public static int helper(int[] nums, int n){
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; n > i; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[n - 1];
    }
}