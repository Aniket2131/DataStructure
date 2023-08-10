public class Q33{
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2}, target = 0;
        System.out.println(search(nums, target, target, target));
    }

    public static int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    public static int search(int[] nums, int target, int left, int right){
        if(left > right) return -1;

        int m = left + (right - left)/2;

        if(nums[m] == target) return m;

        if(nums[m] >= nums[left]){
            if(target >= nums[left] && nums[m] >= target){
                return search(nums, target, left, m - 1);
            }
            else{
                return search(nums, target, m + 1, right);
            }
        }
        else{
            if(target >= nums[m] && nums[right] >= target){
                return search(nums, target, m + 1, right);
            }
            else{
                return search(nums, target, left, m - 1);
            }
        }
    }
}