public class Q1482 {
    public static void main(String[] args) {
        int bloomDay[] = {7,7,7,7,12,7,7}, m = 2, k = 3;
        System.out.println(minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (m * k > n || m > n || k > n)
            return -1;
        int l = 1, h = Integer.MIN_VALUE;
        for(int el : bloomDay){
            h = Math.max(h, el);
        }
        while(h >= l){
            int mid = l + (h - l)/2;
            int cnt = 0;
            int num = 0;
            for(int el : bloomDay){
                if(mid >= el){
                    cnt++;
                }
                else{
                    cnt = 0;
                }
                if(cnt == k){
                    cnt = 0;
                    num++;
                }
            }
            if(num < m){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return l;
    }
}
