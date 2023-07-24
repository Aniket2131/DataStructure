public class power {
    public static void main(String[] args) {
        
    }

    public double myPow(double x, int n) {
        long p = n;
        if(p < 0) p = -1 * p;
        double ans = 1.0;
        while(p > 0){
            if(p % 2 == 0){
                x *= x;
                p /= 2;
            }
            else{
                ans *= x;
                p -= 1;
            }
        }
        if(n < 0) ans = (double)(1.0) / (double)(ans);

        return ans;
    }
}
