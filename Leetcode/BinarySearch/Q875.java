public class Q875{
    public static void main(String[] args) {
        int[] nums = {805306368,805306368,805306368};
        System.out.println(minEatingSpeed(nums, 1000000000));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int ans = Integer.MIN_VALUE;
        for(int el: piles){
            ans = Math.max(el, ans);
        }
        if(h == n) return ans;
        int l = 1;
        int e = ans;
        while(l <= e){
            int m = l + (e - l)/2;
            int sum = 0;
            for(int el : piles){
                sum += Math.ceil(1.0 * el/m);
            }
            if(sum > h){
                l = (int)m + 1;
            }
            else{
                e = (int)m - 1;
            }
        }
        return l; 
    }
}