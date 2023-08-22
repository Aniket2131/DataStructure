public class Q2750 {
    public static void main(String[] args) {
        
    }

    public int numberOfGoodSubarraySplits(int[] nums) {
        int n = nums.length;
        int lo = -1;
        long ans = 0;
        for(int hi = 0; n > hi; hi++){
            if(nums[hi] == 1){
                if(ans == 0){
                    ans++;
                }
                else{
                    ans *= hi - lo;
                    ans %= 1000000007;
                }
                lo = hi;
            }
        }
        return (int)ans;
    }
}
