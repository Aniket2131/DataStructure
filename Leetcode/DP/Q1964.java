public class Q1964 {
    public static void main(String[] args) {
        int[] obstacles = {1,2,3,2};
        System.out.println(longestObstacleCourseAtEachPosition(obstacles));
    }

    public static int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int dp[] = new int[n];
        int[] ans = new int[n];
        int len = 0;
        for(int i = 0; n > i; i++){
            int el = obstacles[i];
            int idx = binarySearch(dp, 0, len - 1, el);
            if(idx == len) len++;
            dp[idx] = el;
            ans[i] = idx + 1;
        }
        return ans;
    }

    public static int binarySearch(int[] dp, int l, int r, int el){
        while(r >= l){
            int m = l + (r - l)/2;
            if(el >= dp[m]){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return l;
    }
}
