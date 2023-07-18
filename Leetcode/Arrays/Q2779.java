import java.util.Arrays;

public class Q2779{
    public static void main(String[] args) {
        int nums[] = {4,6,1,2}, k = 2;
        System.out.println(maximumBeauty(nums, k));
    }

    public static int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j,  n = nums.length;
        for(j = 0; n > j; j++){
            if(nums[j] - nums[i] > k * 2) i++;
        }
        return j - i;
    }
}