import java.util.Arrays;

public class Qq8015 {
    public static void main(String[] args) {
        String moves = "_R";
        System.out.println(furthestDistanceFromOrigin(moves));
    }

    static int[][] dp;
    static int n;
    public static int furthestDistanceFromOrigin(String moves) {
        n = moves.length();
        dp = new int[moves.length() + 1][(n * 2) + 2];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(moves, 0, 0);
    }
    
    public static int helper(String moves, int org, int ind) {
        if(ind == moves.length()) return Math.abs(org);
        if(dp[ind][org + n] != -1) return dp[ind][org + n];
        int res = 0;
        char ch = moves.charAt(ind);
        if(ch == 'L' || ch == '_') res = Math.max(helper(moves, org - 1, ind + 1), res);
        
        if(ch == 'R' || ch == '_') res = Math.max(helper(moves, org + 1, ind + 1), res);
        
        return dp[ind][org + n] = res;
    }
}
