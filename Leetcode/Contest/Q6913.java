public class Q6913 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,3,4};
        System.out.println(alternatingSubarray(nums));
    }

    public static int alternatingSubarray(int[] nums) {
        Boolean flag = false;
        int ans = -1;
        for(int i = 0; nums.length > i; i++){
            flag = false;
            for(int j = i + 1; nums.length > j; j++){
                if(nums[j] - nums[j - 1] == 1 && flag == false){
                    ans = Math.max(ans, j - i + 1);
                    flag = true;
                }
                else if(nums[j] - nums[j - 1] == -1 && flag == true){
                    ans = Math.max(ans, j - i + 1);
                    flag = false;
                }
                else{
                    break;
                }
            }
            
        }
        return ans;
    }
}
