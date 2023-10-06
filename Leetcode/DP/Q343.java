public class Q343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(5));
    }

    public static int integerBreak(int n) {
        int ans = 1;
        if(n == 2 || n == 3) return n-1; 
        while(n >= 5){
            ans *= 3;
            n -= 3;
        }
        return ans*n;
    }
}
