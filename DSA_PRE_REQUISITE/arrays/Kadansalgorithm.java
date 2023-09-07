public class Kadansalgorithm{
    public static void main(String[] args) {
        int[] nums  ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int total_sum = 0;
        for(int el : nums){
            total_sum += el;
            max = Math.max(max, total_sum);
            if( total_sum < 0) total_sum = 0;
        }
        return max;
    }
}