public class Q1035 {
    public static void main(String[] args) {
        int[] nums1 = {1,4,2}, nums2 = {1,2,4};
        System.out.println(maxUncrossedLines(nums1, nums2));
    }

    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int r = nums1.length;
        int c = nums2.length;
        int[][] dp = new int[r + 1][c + 1];
        
        for(int i = r - 1; i >= 0; i--){
            for(int j = c - 1; j >= 0; j--){
                if(nums1[i] == nums2[j]){
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                }
                else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }
}
