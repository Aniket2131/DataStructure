public class bestTimeToBuyAndSellStock3 {
    public static void main(String[] args) {
        
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] bestSell = new int[n];
        int selMin = prices[0];
    
        for(int i = 1; n > i; i++){
            bestSell[i] = Math.max(bestSell[i-1], prices[i] - selMin);
            selMin = Math.min(selMin, prices[i]);
        }

        int[] bestBuy = new int[n];
        int max = prices[n-1];
        for(int i = n-2; i >= 0; i--){
            bestBuy[i] = Math.max(bestBuy[i + 1], max - prices[i]);
            max = Math.max(max, prices[i]);
        }
        int ans = 0;
        for(int i = 0; n > i; i++){
            ans = Math.max(ans, bestBuy[i] + bestSell[i]);
        }
        return ans;
    }
}
