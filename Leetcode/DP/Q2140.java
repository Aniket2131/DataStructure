import java.util.Arrays;

public class Q2140 {
    public static void main(String[] args) {
        int[][] questions = {{3,2},{4,3},{4,4},{2,5}};
        System.out.println(mostPoints(questions));
    }

    public static long[] dp;
    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        dp = new long[n];
        Arrays.fill(dp, -1);
        return helper(questions, 0);    
    }

    public static long helper(int[][] questions, int ind){
        if(ind > questions.length - 1) return 0;

        if(dp[ind] != -1) return dp[ind];

        long taken = questions[ind][0] + helper(questions, ind + questions[ind][1] + 1);

        long notTaken = helper(questions, ind + 1);

        return dp[ind] = Math.max(taken, notTaken);
    }
}
