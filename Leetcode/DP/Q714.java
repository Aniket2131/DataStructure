public class Q714{
    public static void main(String[] args) {
        
    }

    public static int maxProfit(int[] prices, int fee) {
        int obsp = -prices[0]; //old buy state price
        int ossp = 0; //old sold state price
        int n = prices.length;
        for(int i = 1; n > i; i++){
            int nbsp = 0;
            int nssp = 0;
            if(ossp - prices[i] > obsp){ //buy only if your obsp is less than nbsp
                nbsp = ossp - prices[i];
            }
            else{
                nbsp = obsp;
            }
            if(obsp + prices[i] - fee > ossp){ //sold only if ossp is smaller than nssp
                nssp = obsp + prices[i] - fee;
            }
            else{
                nssp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        return ossp;
    }
}