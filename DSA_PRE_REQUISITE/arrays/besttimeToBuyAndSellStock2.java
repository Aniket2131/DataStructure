public class besttimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        
    }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int total = 0;
        for(int i = 1; prices.length > i; i++){
            if(prices[i] < prices[i-1]){
                total += prices[i - 1] - min;
                min = prices[i];
            }
        }
        if(min != prices[prices.length - 1]){
            total += prices[prices.length - 1] - min;
        }
        return total;
    }
}
