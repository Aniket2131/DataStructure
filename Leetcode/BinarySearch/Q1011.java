public class Q1011{
    public static void main(String[] args) {
        int weights[] = {3,3,3,3,3,3}, days = 2;
        System.out.println(shipWithinDays(weights, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int l = 1, h = 0;
        for(int el : weights){
            h += el;
        }
        while(h >= l){
            int m = l + (h - l)/2;
            int cnt = countDays(weights, m);
            if(cnt > days){
                l = m + 1;
            }
            else{
                h = m-1;
            }
        }
        return l;
    }

    public static int countDays(int[] weights, int m){
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