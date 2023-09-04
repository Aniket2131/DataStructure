import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int nums[] = {2,6,7,3,1,7}, m = 3, k = 4;
        System.out.println(maxSum(nums, m, k));
    }

    public static long maxSum(int[] nums, int m, int k) {
        long ans = 0;
        int mod = 1000000007;
        int n = nums.length;
        for(int i = 0; i <= (n - k); i++){
            int j = i + 3;
            long sum = 0;
            int chek = 0;
            Boolean f = false;
            while(j > i){
                if(nums[j] != nums[j - 1]){
                    chek++;
                }
                sum = (sum + nums[j]) % mod;
                if(j - 1 == i){
                    sum = (sum + nums[i]) % mod;
                }
                j--;
            }
            if(chek >= m){
                ans = Math.max(ans, sum);
            }
            // if(!f){
            //     ans = Math.max(ans, sum);
            // }
        }
        return ans;
    }
}
