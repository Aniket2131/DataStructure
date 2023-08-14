public class Q260 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(singleNumber(nums));
    }

    public static int[] singleNumber(int[] nums) {
        int num = 0;
        for(int el: nums){
            num = num ^ el; 
        }
        
        int ans1 = 0;
        int ans2 = 0;
        int rsb = (num & -num);
        for(int el : nums){
            if((el & rsb) == 0){
                ans1 = ans1 ^ el;
            }
            else{
                ans2 = ans2 ^ el;
            }
        }
        int[] ans = new int[2];
        if(ans1 > ans2){
            ans[0] = ans2;
            ans[1] = ans1;
        }
        else{
            ans[0] = ans1;
            ans[1] = ans2;
        }
        return ans;
    }
}
