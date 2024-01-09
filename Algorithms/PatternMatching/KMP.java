import java.util.ArrayList;

public class KMP{
    public static void main(String[] args) {
        
    }

    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        int n = txt.length(), m = pat.length();
        int[] LPS = new int[m];
        dolps(pat, LPS);
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0, j = 0;
        while(i < n){
            char ch1 = txt.charAt(i), ch2 = pat.charAt(j);
            if(ch1 == ch2){
                i++;
                j++;
            }
            if(j == m){
                ans.add(i - m + 1);
                j = LPS[j-1];
            }
            else if(i < n && ch1 != ch2){
                
                if(j != 0){
                    j = LPS[j - 1];
                }
                else{
                    i++;
                }
                
            }
        }
        if(ans.size() == 0) ans.add(-1);
        return ans;
    }
    
    void dolps(String s, int[] LPS){
        int i = 1, len = 0;
        
        while(i < s.length()){
            
            if(s.charAt(i) == s.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = LPS[len-1];
                }
                else{
                    LPS[i] = 0;
                    i++;
                }
            }
        }
    }
}