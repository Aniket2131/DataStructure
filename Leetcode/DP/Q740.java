public class Q740 {
    public static void main(String[] args) {
        int[] nums = {3,4,2};
        System.out.println(deleteAndEarn(nums));
    }

    public static int deleteAndEarn(int[] nums) {
        int max = 0;
        int[] freq = new int[20005];
        for(int el : nums){
            max = Math.max(el, max);
            freq[el]++;
        }
        int[] dp = new int[20005];
        dp[1] = freq[1];
        dp[2] = Math.max(freq[2]*2, dp[1]);
        for(int i = 3; max >= i; i++){
            dp[i] = Math.max(freq[i]*i + dp[i - 2], dp[i - 1]);
        }
        return dp[max];
    }
}
