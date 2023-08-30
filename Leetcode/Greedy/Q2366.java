public class Q2366{
    public static void main(String[] args) {
        
    }

    public long minimumReplacement(int[] nums) {
        long ans = 0;
        int n = nums.length;
        int last = nums[n - 1];
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] > last){
                int parts = nums[i]/last;
                if(nums[i] % last != 0) parts++;
                ans += parts - 1;
                last = nums[i]/parts; 
            }
            else{
                last = nums[i];
            }
        }
        return ans;
    }
}