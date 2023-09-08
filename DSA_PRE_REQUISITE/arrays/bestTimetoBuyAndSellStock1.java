public class bestTimetoBuyAndSellStock1 {
    public static void main(String[] args) {
        
    }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int total = 0;
        for(int i = 0; prices.length > i; i++){
            total = Math.max(total, prices[i] -min);
            min = Math.min(min, prices[i]);
            if(total < 0) total = 0;
        }
        return total;
    }
}
