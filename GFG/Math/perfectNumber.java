public class perfectNumber{
    public static void main(String[] args) {
        
    }

    static int isPerfectNumber(long N) {
        // code here
        if(N == 1) return 0;
        long sum = 1;
        for(long i = 2; (i * i) <= N; i++){
            if(N % i == 0){
                sum = sum + i;
                if(N/i != i) sum = sum + N/i;
            }
        }
        return N == sum? 1: 0;
    }
}