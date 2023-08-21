import java.util.List;

public class Q2826{
    public static void main(String[] args) {
        int[] nums = {2,1,3,2,1};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        return helper(nums, 0);
    }

    public static int helper(int[] nums, int ind){
        if(ind == nums.length) return 0;

        int a = (nums[ind] == 1 ? 0: 1) + helper(nums, ind+1);

        int b = (nums[ind] == 2 ? 0: 1) + helper(nums, ind+1);

        int c = (nums[ind] == 3 ? 0: 1) + helper(nums, ind+1);

        return Math.min(a, Math.min(b,c));
    }
}