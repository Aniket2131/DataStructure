public class Q1266 {
    public static void main(String[] args) {
        
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;

        for(int i = 1; points.length > i; i++){

            int x = points[i][0];
            int y = points[i][1];

            ans += Math.max(Math.abs(x - points[i-1][0]), Math.abs(y - points[i-1][1]));

        }

        return ans;
    }
}