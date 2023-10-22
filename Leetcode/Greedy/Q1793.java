public class Q1793{
    public static void main(String[] args) {
        
    }

    public int maximumScore(int[] nums, int k) {
        int n = nums.length, i = k, j = k, min = nums[k], ans = nums[k];
        while(i > 0 || j < n-1){
            int l = 0, r = 0;
            if(i > 0){
                l = nums[i-1];
            }
            if(j < n-1){
                r = nums[j+1];
            }
            if(l > r){
                i--;
                min = Math.min(min, nums[i]);
            }
            else{
                j++;
                min = Math.min(min, nums[j]);
            }
            ans = Math.max(ans, (j-i+1)*min);
        }
        return ans; 
    }
}