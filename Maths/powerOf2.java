public class powerOf2 {
    public static void main(String[] args) {
        
    }

    public static boolean isPowerofTwo(long n){
        
        // Your code here
        while(n > 1){
            if(n % 2 != 0) return false;
            n = (n >> 1);
        }
        return n == 1? true: false;
        
    }
}
