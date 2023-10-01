public class kokoEatingBanana{
    public static void main(String[] args) {
        
    }

    public static int Solve(int N, int[] piles, int H) {
        // code here
        int n = piles.length;
        int ans = Integer.MIN_VALUE;
        for(int el: piles){
            ans = Math.max(el, ans);
        }
        if(H == n) return ans;
        int l = 1;
        int e = ans;
        while(l <= e){
            int m = l + (e - l)/2;
            int sum = 0;
            for(int el : piles){
                sum += Math.ceil(1.0 * el/m);
            }
            if(sum > H){
                l = (int)m + 1;
            }
            else{
                e = (int)m - 1;
            }
        }
        return l;
    }
}