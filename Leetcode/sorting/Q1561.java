import java.util.Arrays;

public class Q1561 {
    public static void main(String[] args) {
        
    }

    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int ans = 0, i = n - 2;
        int cnt = n/3;
        while(cnt > 0){
            ans += piles[i];
            i -= 2;
            cnt--;
        }
        return ans;
    }
}
