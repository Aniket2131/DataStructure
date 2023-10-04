public class paintersPartion {
    public static void main(String[] args) {
        
    }

    static long minTime(int[] arr,int n,int k){
        //code here
        long low = 0;
        long high = 0;
        for(int el : arr){
            low = Math.max(low, el);
            high += el;
        }
        if(k == 1) return high;
        if(k == n) return low;
        while(low <= high){
            long m = low + (high - low)/2;

            long cnt = countSubArray(arr, m);
            if(cnt > k){
                low = m + 1;
            }
            else{
                high = m - 1;
            }
        }
        return low;
        
    }
    
    static long countSubArray(int[] nums, long m){
        long cnt = 1;
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
