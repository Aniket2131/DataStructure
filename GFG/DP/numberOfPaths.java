public class numberOfPaths{
    public static void main(String[] args) {
        
    }

    long numberOfPath(int M, int N) {
        // Code Here
        long mod = 1000000007;
        long ans = 1;
        int n = M+N-2;
        int r = M-1;
        for(long i = 1; r >= i; i++){
            ans = (ans *( n - (i-1)))%mod;
            ans = (ans * modInverse(i, mod))%mod;
        }
        return ans;
    }
    
    long modInverse(long a, long b){
        return pow(a, b-2, b);
    }
    
    long pow(long base, long exp, long mod){
        long res = 1;
        while(exp > 0){
            if(exp%2 == 1){
                res = (res*base)%mod;
            }
            base = (base * base)%mod;
            exp /= 2;
        }
        return res;
    }
}