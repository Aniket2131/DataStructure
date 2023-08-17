// Buy every deep

public class Q122 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int n = prices.length;
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
