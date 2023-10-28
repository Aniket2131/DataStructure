public class bleakNumber{
    public static void main(String[] args) {
        
    }

    public int is_bleak(int n)
    {
        // Code here
        for(int i = n-30; n >= i; i++){
            if(i + bits(i) == n) return 0;
        }
        return 1;
    }
    
    public int bits(int n){
        int cnt = 0;
        while(n > 0){
            cnt += (n & 1);
            n >>= 1;
        }
        return cnt;
    }
}