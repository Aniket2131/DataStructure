public class chaeckIfStringAreRoted {
    public static void main(String[] args) {
        
    }

    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        int n = s1.length();
        for(int i = 0; s2.length() > i; i++){
            if(s1.charAt(i) == s2.charAt(0)){
                int j = 0, k = i;
                while(j < n && s1.charAt(k) == s2.charAt(j)){
                    k++;
                    j++;
                    if(k == n) k = 0;
                }
                if(j == n) return true;
            }
        }
        return false;
    }
}
