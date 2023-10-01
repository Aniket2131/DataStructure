public class smallestDivisor {
    public static void main(String[] args) {
        
    }

    public static int smallestDiviso(int[] nums, int K) {
        int n = nums.length;
        int l = 1, h = Integer.MIN_VALUE;
        for(int el : nums){
            h = Math.max(h, el);
        }
        if(n == K) return h;

        while(h >= l){
            int m = l + (h - l)/2;
            int total = 0;
            for(int el : nums){
                total += Math.ceil(1.0 * el/m);
            }
            if(total <= K){
                h = m - 1;
            }
            else{
                l = m + 1;
            } 
        }
        return l;
    }
}
