import java.util.Arrays;

public class Q354{
    public static void main(String[] args) {
        // int[][] envelopes = {{5,4},{6,7},{6,4},{2,3}};
        int[][] envelopes = {{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},{6,370},{6,360},{7,380}};
        System.out.println(maxEnvelopes(envelopes));
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0]: a[1] - b[1]);
        int n = envelopes.length;
        int hei = envelopes[0][1];
        int wid = envelopes[0][0];
        int ans = 1;
        for(int i = 1; n > i; i++){
            if(envelopes[i][0] > wid & envelopes[i][1] > hei){
                ans++;
                wid = envelopes[i][0];
                hei = envelopes[i][1];
            }
        }
        return ans;
    }
}