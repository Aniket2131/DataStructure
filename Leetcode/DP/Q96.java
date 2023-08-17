public class Q96 {
    public static void main(String[] args) {
        System.out.println(numTrees(6));
    }

    public static int numTrees(int n) {
        return catlanNumber(n);
    }

    public static int catlanNumber(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; n >= i; i++){
            int cnt = 0;
            for(int j = 0; i > j; j++){
                cnt += dp[j] * dp[i - j - 1];
            }
            dp[i] = cnt;
        } 
        return dp[n];
    }
}
