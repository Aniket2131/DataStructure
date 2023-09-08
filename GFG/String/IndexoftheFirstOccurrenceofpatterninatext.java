public class IndexoftheFirstOccurrenceofpatterninatext {
    public static void main(String[] args) {
        
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
    
    public void getLPS(String pat, int[] LPS){
        int len = 0;
        int i = 1;
        while(i < pat.length()){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            }
            else{
                if(len == 0){
                    LPS[i] = 0;
                    i++;
                }
                else{
                    len = LPS[len - 1];
                }
            }
        }
    }
}
