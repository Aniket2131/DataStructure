public class stockBuyAndSellII{
    public static void main(String[] args) {
        int n = 4, price[] = {3, 4, 1, 5};
        System.out.println(stockBuyAndSell(n, price));
    }

    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        int min = prices[0];
        int profit = 0;
        for(int i = 1; n > i; i++){
            if(prices[i - 1] > prices[i]){
                profit += prices[i - 1] - min;
                min = prices[i]; 
            }
            if(i == n - 1 & prices[i] >= prices[i - 1]){
                profit += prices[i] - min;
            }
        }
        return profit;
    }
}