public class Q309 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int obsp = -prices[0]; //old buy state price
        int ossp = 0; //old sold state price
        int ocsp = 0; //old cooling state price
        int n = prices.length;
        for(int i = 1; n > i; i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            nbsp = Math.max(ocsp - prices[i], obsp);
            nssp = Math.max(prices[i] + obsp, ossp);
            ncsp = Math.max(ossp, ocsp);
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        return ossp;
    }
}
