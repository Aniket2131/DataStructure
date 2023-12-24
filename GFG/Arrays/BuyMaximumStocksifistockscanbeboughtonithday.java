import java.util.Arrays;

public class BuyMaximumStocksifistockscanbeboughtonithday {
    public static void main(String[] args) {
        int[] price = {2, 5, 9, 9, 8, 15, 12};
        System.out.println(buyMaximumProducts(price.length, 46, price));
    }

    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        long[] ar = new long[n];
        
        for(int i = 0; n > i; i++){
            ar[i] = (price[i]*100000) + (i +1); 
        }
        Arrays.sort(ar);
        int ans = 0;
        for(int i = 0; n > i; i++){
            int num = (int)ar[i]/100000;
            int f = (int)ar[i]%100000;
            
            int p = num * f;
            if(p <= k){
                ans += f;
                k -= p;
            }
            else{
                ans += (k/num);
                k -= (k/num)*num;
            }
        }
        
        return ans;
    }
}
