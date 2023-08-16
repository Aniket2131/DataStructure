import java.util.Arrays;

public class Q354{
    public static void main(String[] args) {
        // int[][] envelopes = {{5,4},{6,7},{6,4},{2,3}};
        int[][] envelopes = {{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},{6,370},{6,360},{7,380}};
        System.out.println(maxEnvelopes(envelopes));
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0]? b[1] - a[1]: a[0] - b[0]);
        int n = envelopes.length;
        int[] dp = new int[n];
        int ans = 0;
        for(int[] el : envelopes){
            int h = el[1];
            int l = Arrays.binarySearch(dp, 0, ans, h);
            if(0 > l) l = - l - 1;
            if(l == ans) ans++;
            dp[l] = h;
        }
        return ans;
    }
}