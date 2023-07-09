import java.util.Arrays;

public class Q6899{
    public static void main(String[] args) {
        int nums[] = {1,3,6,4,1,2}, target = 0;
        System.out.println(maximumJumps(nums, target));
    }

    public static int maximumJumps(int[] nums, int target) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        for(int i = 0; nums.length > i; i++){
            if(arr[i] == -1) continue;
            for(int j = i+1; nums.length > j; j++){
                if(-target <= nums[j] - nums[i] && nums[j] - nums[i] <= target){
                    arr[j] = Math.max(arr[j], arr[i] + 1);    
                }
            }
        }
        return arr[nums.length - 1];
    }
}