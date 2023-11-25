public class Q1685 {
    public static void main(String[] args) {
        
    }

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        int[] suf = new int[n];
        suf[n-1] = nums[n-1];
        for(int i = 1; n > i; i++){
            pre[i]  = pre[i-1] + nums[i];
            suf[n-i-1] = nums[n-i-1] + suf[n-i];
        }
        int[] ans = new int[n];
        ans[0] = suf[1] - nums[0]*(n-1);
        for(int i = 1; n-1 > i; i++){
            ans[i] = (nums[i] * i) - pre[i-1] + suf[i+1] - (nums[i]*(n-i-1));
        }
        ans[n-1] = (nums[n-1]*(n-1))-pre[n-2];
        return ans;
    }
}
