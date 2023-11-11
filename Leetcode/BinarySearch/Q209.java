public class Q209{
    public static void main(String[] args) {
        
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 1, h = n;
        while(h >= l){
            int m = l + (h - l)/2;
            boolean f = solve(m, target, nums);
            if(f){
                h = m-1;
            }
            else{
                l = m + 1;
            }
        }
        return l > nums.length ? 0: l; 
    }

    public boolean solve(int m, int trg, int[] nums){
        int i = 0, j = 0, sum = 0;
        while(j < m){
            sum += nums[j];
            j++;
        }
        if(sum >= trg) return true;
        for(; j < nums.length; j++){
            sum -= nums[i];
            sum += nums[j];
            if(sum >= trg) return true;
            i++;
        }
        return false;
    } 
}