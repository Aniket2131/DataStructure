public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(nthFibonacci(10));
    }

    public static int nthFibonacci(int n){
        // code here
        if(n == 1 || n == 2) return 1;
        int e = 1000000007;
        int pre = 1;
        int cur = 1;
        int ans = 0;
        for(int i = 3; n >= i; i++){
            ans = ((pre % e) + (cur % e)) % e;
            pre = cur;
            cur = ans;
        }
        return ans;
    }
}
