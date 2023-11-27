public class Q2944 {
    public static void main(String[] args) {
        // int[] prices = {3,1,2};
        int[] prices = {1,10,1,1};
        System.out.println(minimumCoins(prices));
    }

    static int ans;
    public static int minimumCoins(int[] prices) {
        ans = Integer.MAX_VALUE;
        
        return prices[0] + solve(0, prices);
    }
    
    public static int solve(int ind, int[] p){
        if(ind >= p.length){
            return 0;
        }
        int l = ind+1;
        int h = 2;
        int sum = Integer.MAX_VALUE;
        if(ind != 0) h = ind + ind + 1;
        for(; l <= Math.min(h, p.length-1); l++){
            int a = p[l] + solve(l, p);
            sum = Math.min(a, sum);        
        }
        if(l <= h) sum = 0;
        return sum;
        // return sum == Integer.MAX_VALUE ? 0 : sum;
    }
}
