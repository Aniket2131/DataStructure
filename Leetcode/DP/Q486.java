import java.util.Arrays;

public class Q486{
    public static void main(String[] args) {
        int[] nums = {1,5,2};
        System.out.println(PredictTheWinner(nums));
    }

     public static int[][] dp;
        public static boolean PredictTheWinner(int[] nums) {
            int n = nums.length;
            dp = new int[n][n];
            for(int i = 0; n > i; i++){
                Arrays.fill(dp[i], -1);
            }
            return PredictTheWinner(nums, 0, n - 1) >= 0;
        }

        public static int PredictTheWinner(int[] nums, int l, int r){
            if(dp[l][r] != -1){
                return dp[l][r];
            }
            if(l == r) return nums[l];

            int left = nums[l] - PredictTheWinner(nums, l + 1, r);
            int right = nums[r] - PredictTheWinner(nums, l, r - 1);

            dp[l][r] = Math.max(left, right);

            return dp[l][r];
        }            
}