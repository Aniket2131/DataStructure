public class minimumDaysToMakeMBouquet {
    public static void main(String[] args) {
    }

    public static int solve(int M, int K, int[] bloomDay) {
        int n = bloomDay.length;
        long p = (long)M * K;
         if (p > n)
             return -1;
         int l = 1, h = Integer.MIN_VALUE;
         for(int el : bloomDay){
             h = Math.max(h, el);
         };
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
                 if(cnt == K){
                     cnt = 0;
                     num++;
                 }
             }
             if(num < M){
                 l = mid+1;
             }
             else{
                 h = mid-1;
             }
         }
         return l;
     }


}
