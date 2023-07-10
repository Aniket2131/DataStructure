public class Q1137 {
    public static void main(String[] args) {
        System.out.println(5);
    }

    public static int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        int prev = 1, sprev = 1, tprev = 0, ans = 0;
        for(int i = 3; n >= i; i++){
           ans = prev + sprev + tprev;
           tprev = sprev;
           sprev = prev;
           prev = ans;     
        }
        return ans;
    }
}
