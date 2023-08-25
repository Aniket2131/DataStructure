import java.util.Arrays;

public class Q97 {
    public static void main(String[] args) {
        
    }

    int n1;
    int n2;
    int n3;
    int[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        n1 = s1.length();
        n2 = s2.length();
        n3 = s3.length();
        dp = new int[n1 + 1][n2 + 1];
        for(int[] ar: dp){
            Arrays.fill(ar, -1);
        }
        return helper(s1, s2, s3 ,0, 0) == 0 ? false: true;
    }

    public int helper(String s1, String s2, String s3, int i, int j){
        if(i == n1 && j == n2 && (i + j) == n3) return 1;

        if(i + j == n3) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int ans = 0;

        if(i < n1 && s1.charAt(i) == s3.charAt(i + j)){
            ans |= helper(s1, s2, s3, i+1, j);
        }

        if(j < n2 && s2.charAt(j) == s3.charAt(i + j)){
            ans |= helper(s1, s2, s3, i, j + 1);
        }

        return dp[i][j] = ans;
    }
}
