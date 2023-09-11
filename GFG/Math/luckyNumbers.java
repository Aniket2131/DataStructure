public class luckyNumbers {
    public static void main(String[] args) {
        
    }

    public static boolean isLucky(int n)
    {
        // Your code here
        return solve(n, 2);
    }
    
    public static boolean solve(int n, int cnt){
        if(cnt > n) return true;
        
        if(n % cnt == 0) return false;
        
        int newNum = n - (n / cnt);
        
        cnt++;
        
        return solve(newNum, cnt);
    }
}
