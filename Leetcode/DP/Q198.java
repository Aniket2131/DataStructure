public class Q198 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] ans = new int[n];
        ans[0] = nums[0];
        ans[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; n > i; i++){
            ans[i] = Math.max(ans[i - 2] + nums[i], ans[i - 1]);
        }
        return ans[n - 1];
    }
}
