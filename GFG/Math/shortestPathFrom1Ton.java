public class shortestPathFrom1Ton{
    public static void main(String[] args) {
        
    }

    public int minStep(int n)
    {
        // code here
        int ans = 0;
        while(n >= 3) {
            ans += n % 3 + 1;
            n /= 3;
        }
        
        return ans + (n-1);
    }
}