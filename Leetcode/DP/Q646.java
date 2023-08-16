import java.util.Arrays;

public class Q646 {
    public static void main(String[] args) {
        int[][] pairs = {{1,2}, {7,8}, {4,5}};
        System.out.println(findLongestChain(pairs));
    }

    public static int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int max = pairs[0][1];
        int ans = 1;
        for(int i = 1; n > i; i++){
            if(pairs[i][0] > max){
                ans++;
                max = pairs[i][1];
            }
        }
        return ans;
    }
}
