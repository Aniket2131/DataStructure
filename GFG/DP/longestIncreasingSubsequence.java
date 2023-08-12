public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        int N = 16, A[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        System.out.println(longestSubsequence(N, A));
    }

    public static int longestSubsequence(int size, int a[])
    {
        // code here
        int[] dp = new int[size];
        int ans = 0;
        for(int el : a){
            int i = 0, j = ans;
            while(i != j){
                int m = (i + j)/2;
                if(el > dp[m]){
                    i = m + 1;
                }
                else{
                    j = m;
                }
            }
            dp[i] = el;
            if(i == ans) ans++;
        }
        return ans;
    }
}
