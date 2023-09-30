public class findMinumumInRoted {
    public static void main(String[] args) {
        // int[] nums = {3,4,5,1,2};
        // System.out.println(findMin(nums));
    }

    int ans;
    public int findMin(int[] nums) {
        ans = Integer.MAX_VALUE;
        return find(nums, 0, nums.length-1);
    }

    public int find(int[] nums, int l, int h) {
        if(l >= h) return Math.min(ans, nums[l]);
        int m = l + (h - l)/2;
        if(nums[m] >= nums[l]){
            ans = Math.min(ans, nums[l]);
            return find(nums, m+1, h); 
        }
        else{
            ans = Math.min(ans, nums[m]);
            return find(nums, l, m-1);
        }
    }
}
