import java.util.Stack;

public class Q20{

    public static void main(String[] args) {
        
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                char chs = '#';
                if(!st.isEmpty()){
                    chs = st.pop();
                }
                boolean flag = false;
                if(chs == '(' && ch ==')'){
                    flag = true;
                }
                else if(chs == '{' && ch == '}') flag = true;
                else if(chs == '[' && ch == ']') flag = true;
                if(!flag) return false;
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}