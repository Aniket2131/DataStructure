import java.util.Arrays;

public class Q1877{
    public static void main(String[] args) {
        
    }

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n-1;
        int ans = Integer.MIN_VALUE;
        while(j > i){
            ans = Math.max(ans, nums[i++]+nums[j--]);
        }
        return ans;
    }
}