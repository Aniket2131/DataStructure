public class LargestSumSubarrayOfSizeAtLeastK {
    public static void main(String[] args) {
        
    }

    public static long maxSumWithK(long a[], long n, long k)
    {
        long[] kadan = new long[(int) n];
        long sum = 0;
        
        for(int i = 0; n > i; i++){
            
            sum += a[i];
            kadan[i] = sum;
            if(sum < 0) sum = 0;
            
        }
        sum = 0;
        int l = 0, r = 0;
        long ans = Integer.MIN_VALUE;
        for(; r < k; r++){
            
            sum += a[(int) r];

        }
        ans = Math.max(ans, sum);
        for(;r < n; r++){
            
            sum -= a[l];
            sum += a[r];
            ans = Math.max(ans, sum);
            ans = Math.max(ans, sum + kadan[l]);
            l++;
            
        }
        return ans;
    }
}
