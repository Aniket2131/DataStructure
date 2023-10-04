public class splitArrayLargestSum{
    public static void main(String[] args) {
        
    }

    static int splitArray(int[] arr , int N, int K) {
        // code here
        
        int low = 0;
        int high = 0;
        for(int el : arr){
            low = Math.max(low, el);
            high += el;
        }
        if(K == 1) return high;
        if(K == N) return low;
        while(low <= high){
            int m = low + (high - low)/2;

            int cnt = countSubArray(arr, m);
            if(cnt > K){
                low = m + 1;
            }
            else{
                high = m - 1;
            }
        }
        return low;
    }
    
    static int countSubArray(int[] nums, int m){
        int cnt = 1;
        int sum = 0;
        for(int el: nums){
            if(sum + el > m){
                cnt++;
                sum = el;
            }
            else{
                sum += el;
            }
        }
        return cnt;
    }
}