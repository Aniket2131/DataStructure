import java.util.Arrays;
import java.util.List;

public class Q2826{
    public static void main(String[] args) {
    
    }

    int[][] dp;
    public int minimumOperations(List<Integer> nums) {
        dp = new int[nums.size() + 1][4];
        for(int[] r : dp){
            Arrays.fill(r, -1);
        }
        return helper(nums, 0, 0);
    }

    public int helper(List<Integer> nums, int ind, int prev){
        if(ind == nums.size()) return 0;
        if(dp[ind][prev] != -1) return dp[ind][prev];
        int cur = nums.get(ind);
        int ans = Integer.MAX_VALUE;
        for(int i = prev; 3 >= i; i++){
            if(i == cur) ans = Math.min(ans, helper(nums, ind + 1, i));
            ans = Math.min(ans, 1 + helper(nums, ind + 1, i));
        }

        return dp[ind][prev] = ans;
    }
}