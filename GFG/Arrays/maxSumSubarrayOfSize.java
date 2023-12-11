import java.util.ArrayList;

public class maxSumSubarrayOfSize{
    public static void main(String[] args) {
        
    }

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long ans = Arr.get(0), sum = Arr.get(0), cnt = 1;
        
        for(int i = 1; N > i; i++){
            if(cnt == K){
                sum -= Arr.get(i - K);
                cnt--;
                
            }
            
            sum += Arr.get(i);
            ans = Math.max(ans, sum);
            cnt++;
        }
        
        return ans;
    }
}