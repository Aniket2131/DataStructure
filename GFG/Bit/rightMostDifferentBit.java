public class rightMostDifferentBit {
    public static void main(String[] args) {
        
    }

    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here
        if(m == n) return -1;
        int ans = 1;
        while(m >= 1 && n >= 1){
            int r1 = m % 2, r2 = n % 2;
            if(r1 != r2) return ans;
            m /= 2;
            n /= 2;
            ans++;
        }
        while(m >= 1){
            if(m % 2 == 1) return ans;
            m /= 2;
            ans++;
        }
        return ans;    
    }
}
