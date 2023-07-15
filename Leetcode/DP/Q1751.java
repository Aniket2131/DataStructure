import java.util.Arrays;

public class Q1751{
    public static void main(String[] args) {
        int events[][] = {{1,2,4},{3,4,3},{2,3,1}}, k = 2;
        System.out.println(maxValue(events, k));
    }

    public static int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int[][] dp = new int[k + 1][events.length];
        return dfs(events, k, 0, dp);
    }

    public static int dfs(int[][] events, int k, int ind, int[][] dp){
        if(k == 1){
            int ans = 0;
            while(events.length > ind){
                ans = Math.max(ans, events[ind++][2]);
            }
            return ans;
        }
        if(dp[k][ind] != 0) return dp[k][ind];
        int res = 0;
        for(int i = ind; events.length > i; i++){
            int val = events[i][2];

            for(int j = i + 1; events.length > j; j++){
                if(events[j][0] > events[i][1]){
                    res = Math.max(res, val + dfs(events, k-1, j, dp));
                }
            }
            res = Math.max(res, val);
        }
        return dp[k][ind] = res;
    }
}