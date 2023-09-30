public class searchInRottedArray {
    public static void main(String[] args) {
        
    }

    public static boolean Search(int N, int[] nums, int target) {
        // code here
        return binary(nums, 0, N-1, target);
    }
    
    public static boolean binary(int[] nums, int l, int h, int target) {
        // code here
        if(l > h) return false;
        
        int m = l + (h - l)/2;
        
        if(target == nums[m]) return true;
        
        if(nums[l] == nums[h]) return binary(nums, l, h-1, target);
        
        else if(nums[m] >= nums[l]){
            if(target >= nums[l] && target <= nums[m]){
                return binary(nums, l, m-1, target);
            }
            else{
                return binary(nums, m+1, h, target);
            }
        }
        else{
            if(target >= nums[m] && target <= nums[h]){
                return binary(nums, m+1, h, target);
            }
            else{
                return binary(nums, l, m-1, target);
            }
        }
    }
}
