import java.util.Arrays;

public class Q1913{
    public static void main(String[] args) {
        
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n-1]*nums[n-2]) - (nums[0]*nums[1]);
    }
}