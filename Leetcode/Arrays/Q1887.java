import java.util.Arrays;

public class Q1887 {
    public static void main(String[] args) {
        
    }

    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, n = nums.length;
        int i = n - 1;
        while(i > 0){
            if(nums[i] == nums[i - 1]) i--;
            else{
                ans += (n - i);
                i--;
            }
        }
        return ans;
    }
}
