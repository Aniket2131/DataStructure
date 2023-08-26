import java.util.Arrays;

public class Q2616{
    public static void main(String[] args) {
        
    }

    public int minimizeMax(int[] nums, int p) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = nums[n - 1] - nums[0];
        int ans = 0;
        while(l <= r){
            int m = l + (r - l)/2;
            if(countPair(nums, m) >= p){
                ans = m;
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return ans;
    }

    public int countPair(int[] nums, int trg){
        int i = 0;
        int cnt = 0;
        while(i < nums.length - 1){
            if(nums[i + 1] - nums[i] <= trg){
                cnt++;
                i += 2;
            }
            else{
                i+=1;
            }
        }
        return cnt;
    }
}