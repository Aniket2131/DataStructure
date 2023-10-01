public class shipPackeagedToDeliver{
    public static void main(String[] args) {
        
    }

    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int l = 1, h = 0;
        for(int el : arr){
            h += el;
        }
        if(D == 1) return h;
        while(h >= l){
            int m = l + (h - l)/2;
            int cnt = countDays(arr, m);
            if(cnt > D){
                l = m + 1;
            }
            else{
                h = m-1;
            }
        }
        return l;
    }
    
    static int countDays(int[] weights, int m){
        int cnt = 0;
        int sum = 0;
        for(int el : weights){
            int newSum = sum;
            newSum += el;
            if(newSum > m){
                cnt++;
                sum = 0;
                if(el > m) return Integer.MAX_VALUE;
            }
            sum += el;
        }
        if(sum > 0 && sum <= m) cnt++;
        return cnt;
    }
}