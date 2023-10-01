import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        
    }

    public static int solve(int n, int k, int[] stalls) {
        int l = 1;
        Arrays.sort(stalls);
        int h = stalls[n-1] - stalls[0];
        while(h >= l){
            int m = l + (h - l)/2;
            if(plassingPossible(stalls, m, k)){
                l = m + 1;
            }
            else{
                h = m-1;
            }
        }
        return h;
    }
    
    public static boolean plassingPossible(int[] stalls, int m, int k){
        int cnt = 1;
        int lst = stalls[0];
        for(int i = 1; stalls.length > i; i++){
            if(stalls[i] - lst >= m){
                cnt++;
                lst = stalls[i];
            }
        }
        return cnt >= k;
    }
}
