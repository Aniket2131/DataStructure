import java.util.Arrays;

public class Q8049{
    public static void main(String[] args) {
        int sx = 2, sy = 4, fx = 7, fy = 7, t = 6;
        System.out.println(isReachableAtTime(sx, sy, fx, fy, t));
    }

    static int[][] dp;
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        // return solve(sx, sy, fx, fy, t, 0);
        dp = new int[fx+1][fy+1];
        for(int[] el: dp){
            Arrays.fill(el, -1);
        }
        solve(sx, sy, fx, fy, t, 0);
        
        int n = dp[fx+1][fy+1];
        return t < n? true: false;
    }
    
    public static int solve(int sx, int sy, int fx, int fy, int t, int time) {
        if(sx < 0 || sy < 0 || sx > fx || sy > fy) return 0;
        
        if(dp[sx][sy] != -1) return dp[sx][sy];
        
        if(sx == fx && sy == fy) return 1;
        
        int res = 0;
        
        res += solve(sx-1, sy, fx, fy, t, time+1);
        
        res += solve(sx+1, sy, fx, fy, t, time+1);
        
        res += solve(sx, sy-1, fx, fy, t, time+1);
        
        res += solve(sx, sy+1, fx, fy, t, time+1);
        
        res += solve(sx-1, sy-1, fx, fy, t, time+1);
        
        res += solve(sx-1, sy+1, fx, fy, t, time+1);
        
        res += solve(sx+1, sy-1, fx, fy, t, time+1);
        
        res += solve(sx+1, sy+1, fx, fy, t, time+1);
        
        return dp[sx][sy] = res;
    }
}