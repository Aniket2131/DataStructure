public class kthSetBit {
    public static void main(String[] args) {
        
    }

    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        String st = "";
        while(n > 0){
            st += (n%2);
            n /= 2;
        }
        if(st.length() <= k) return false;
        return st.charAt(k) == '0' ? false: true;
    }
}
