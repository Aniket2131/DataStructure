public class countPossibleWaysToCounstructABuilding {
    public static void main(String[] args) {
        
    }

    public int TotalWays(int N)
    {
        // Code here
        long mod = 1000000007;
        long num1 = 2;
        if(N == 1) return (int) (num1 *num1);
        
        long num2 = 3;
        if(N == 2) return (int) (num2 *num2);
        for(int i = 3; N >= i; i++){

            long ans = ((num1 % mod) + (num2 % mod))%mod;
            num1 = (num2%mod);
            num2 = (ans%mod);
            
        }
        
        return (int) (((num2%mod)*(num2%mod))%mod);
    }
}
