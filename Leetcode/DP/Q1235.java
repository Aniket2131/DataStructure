import java.util.Arrays;

public class Q1235{


    public static void main(String[] args) {
        int[] startTime = {1,2,3,4,6}, endTime = {3,5,10,6,9}, profit = {20,20,100,70,60};
        System.out.println(jobScheduling(startTime, endTime, profit));
    }

    static int[][] arr;
    static int n;
    static Integer[] dp;
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        n = startTime.length;
        arr = new int[n][3];
        dp = new Integer[n];
        for(int i = 0; n > i; i++){

            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i];

        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        return solve(0);
    }

    public static int solve(int ind){
        if(ind >= arr.length) return 0;
        if(dp[ind] != null) return dp[ind];
        int nex = getNext(ind+1, arr[ind][1]);
        
        int take = arr[ind][2] + solve(nex);
        
        int ntake = solve(ind+1);

        return dp[ind] = Math.max(take, ntake);
    }

    public static int getNext(int l, int trg){
        int h = n-1, res = n - 1;

        while(l <= h){

            int m = l + (h - l)/2;

            if(arr[m][0] >= trg){
                res = m;
                h = m - 1;
            }
            else{
                l = m + 1;
            }
        }

        return res;
    }
}