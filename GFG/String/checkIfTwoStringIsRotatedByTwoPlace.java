public class checkIfTwoStringIsRotatedByTwoPlace {
    public static void main(String[] args) {
        
    }

    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length() != str2.length()) return false;
        
        return solve(str1, str2, true) | solve(str1, str2, false);
    }
    
    public static boolean solve(String s1, String s2, boolean flag){
        int i1 = 0, i2 = 0;
        if(flag){
            i1 = 2;
        }
        else{
            i2 = 2;
        }
        int n = s1.length();
        while(i1 < n && i2 < n){
            if(s1.charAt(i1) != s2.charAt(i2)) return false;
            i1++;
            i2++;
        }
        if(flag){
            if(s1.charAt(0) != s2.charAt(i2)) return false;
            i2++;
            if(s1.charAt(1) != s2.charAt(i2)) return false;
        }
        else{
            if(s1.charAt(i1) != s2.charAt(0)) return false;
            i1++;
            if(s1.charAt(i1) != s2.charAt(1)) return false;
        }
        return true;
    }
}
