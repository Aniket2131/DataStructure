public class Q2760 {
    public static void main(String[] args) {
        int nums[] = {3,2,5,4}, threshold = 5;
        System.out.println(longestAlternatingSubarray(nums, threshold));
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans = 0;
        for(int i = 0; nums.length > i; i++ ){
            if(nums[i]%2 == 0 && nums[i] <= threshold){
                int max = 1;
                for(int j = i + 1; nums.length > j; j++){
                    if(nums[j] <= threshold && nums[j]%2 != nums[j - 1] % 2){
                        max++;
                    }
                    else{
                        break;
                    }
                }
                ans = Math.max(ans, max);
            }
        }
        return ans;
    }
}
