public class Q2909{
    public static void main(String[] args) {
        
    }

    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        for(int i = 1; n > i; i++){
            pre[i] = Math.min(nums[i], pre[i-1]);
        }
        suf[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            suf[i] = Math.min(nums[i], suf[i+1]);
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; n > i; i++){
            if(nums[i] > pre[i] && nums[i] > suf[i]){
                ans = Math.min(ans, nums[i] + pre[i] +suf[i]);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1: ans;
    }
}