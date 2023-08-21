public class Q459{
    public static void main(String[] args) {
        // String s = "abab";
        String s = "aabaaba";
        // String s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = n/2; i > 0; i--){
            if(n % i == 0){
                String s1 = s.substring(0, i);
                int len = n / i;
                while(len > 1){
                    s1 += s.substring(0, i);
                    len--;
                }
                if(s1.equals(s)) return true;
            }
        }
        return false;
    }
}