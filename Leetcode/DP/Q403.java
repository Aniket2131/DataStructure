import java.util.Arrays;
import java.util.HashMap;

public class Q403{
    public static void main(String[] args) {
        
    }

     HashMap<Integer, Integer> map;
    int[][] dp;
    public boolean canCross(int[] stones) {
       map = new HashMap<>();
       dp = new int[2001][2001];
       for(int[] arr : dp){
           Arrays.fill(arr, -1);
       }
       for(int i = 0; stones.length > i; i++){
           map.put(stones[i], i);
       }
       helper(stones, 0, 0);
       return dp[0][0] == 0? false: true; 
    }

    public int helper(int[] stones, int jump, int ind){
        if(ind == stones.length - 1) return 1;

        if(dp[jump][ind] != -1) return dp[jump][ind];
        
        int res = 0;
        
        if(jump - 1 > 0){
            if(map.containsKey(jump - 1 + stones[ind])){
                res = helper(stones, jump - 1, map.get(jump - 1 + stones[ind]));
            }
        }
        if(res == 1) return dp[jump][ind] = 1;
        if(jump > 0){
            if(map.containsKey(jump + stones[ind])){
                res |= helper(stones, jump, map.get(jump + stones[ind]));
            }
        }
        if(res == 1) return dp[jump][ind] = 1;
        if(jump + 1 > 0){
            if(map.containsKey(jump + 1 + stones[ind])){
                res = helper(stones, jump + 1, map.get(jump + 1 + stones[ind]));
            }
        }

        return dp[jump][ind] = res;
    }
}