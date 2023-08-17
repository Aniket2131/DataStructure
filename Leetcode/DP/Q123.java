public class Q123 {
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[] sellNow = new int[n];
        int min = prices[0];
        int profit = 0;
        int maxProfit = 0;
        sellNow[0] = 0;
        // This is sell Now must condition for the 1st large profit
        for(int i = 1; n > i; i++){
            min = Math.min(prices[i], min);
            profit = Math.max(prices[i] - min, profit);
            maxProfit = Math.max(profit, maxProfit);
            sellNow[i] = maxProfit;
        }

        //This is buy Now must condition for the 2nd large profit
        int[] buyNow = new int[n];
        buyNow[n - 1] = 0;
        int mProfit = 0;
        int max = prices[n - 1];
        int p = 0;
        for(int i = n - 2; i >= 0; i--){
            max = Math.max(max, prices[i]);
            p = max - prices[i];
            mProfit = Math.max(p, mProfit);
            buyNow[i] = mProfit;
        }

        //ans is coming by adding both the arrays
        int ans = Integer.MIN_VALUE;
        for(int i = 0; n > i; i++){
            ans = Math.max(sellNow[i] + buyNow[i], ans);
        }
        return ans;
    }
}
