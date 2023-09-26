import java.util.Stack;

public class Q316{
    public static void main(String[] args) {
        
    }

    public String removeDuplicateLetters(String s) {
        int[] ind = new int[26];
        int n = s.length();
        for(int i = 0; n > i; i++){
            ind[s.charAt(i) - 'a'] = i;
        }
        boolean[] taken = new boolean[26];
        int i = 0;
        Stack<Character> st = new Stack<>();
        while(n > i){
            char ch = s.charAt(i);
            while(!st.isEmpty() && taken[ch - 'a'] == false && st.peek() > ch && i < ind[st.peek() - 'a']){
                taken[st.peek() - 'a'] = false;
                st.pop();
            }
            if(!taken[ch - 'a']){
                st.push(ch);
                taken[ch - 'a'] = true;
            }
            i++;
        }

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.pop();
            ans.insert(0, ch);
        }
        return ans.toString(); 
    }
}