public class Q1283{
    public static void main(String[] args) {
        
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int l = 1, h = Integer.MIN_VALUE;
        for(int el : nums){
            h = Math.max(h, el);
        }
        if(n == threshold) return h;

        while(h >= l){
            int m = l + (h - l)/2;
            int total = 0;
            for(int el : nums){
                total += Math.ceil(1.0 * el/m);
            }
            if(total <= threshold){
                h = m - 1;
            }
            else{
                l = m + 1;
            } 
        }
        return l;
    }
}