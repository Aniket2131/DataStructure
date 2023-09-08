public class KMPAlgo{
    public static void main(String[] args) {
        
    }

    // Finding longest proper prefix suffix (LPS)

    public void getLPS(String s, int[] LPS){
        int len = 0;
        int i = 1;
        int n = s.length();
        while(n > i){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            }
            else{
                if(len == 0) LPS[i] = 0;
                else{
                    len = LPS[len - 1];
                }
            }
        }
    }

    public int findMatching(String text, String pat) {
        // Code here
        int s = text.length();
        int p = pat.length();
        int[] LPS = new int[p];
        getLPS(pat, LPS);
        
        int i = 0, j = 0;
        while(i < s){
            if(text.charAt(i) == pat.charAt(j)){
                i++;
                j++;
                if(j == p) return i - j;
            }
            else if(i < s && text.charAt(i) != pat.charAt(j)){
                if(j == 0){
                    i++;
                }
                else{
                    j = LPS[j - 1];
                }
            }
        }
        return -1;
    }
}