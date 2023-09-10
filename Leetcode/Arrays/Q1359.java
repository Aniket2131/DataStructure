public class Q1359{
    public static void main(String[] args) {
        
    }

    public int countOrders(int n) {
        if(n == 1) return 1;
        long res = 1;
        int mod = 1000000007;
        for(int i = 2; n >= i; i++){
            int spaces = (i - 1)*2 + 1;
            int cnt = spaces * (spaces + 1)/2;
            res *= cnt;
            res %= mod; 
        }
        return (int)res;
    }
}