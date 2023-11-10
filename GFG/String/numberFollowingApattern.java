import java.util.Stack;

public class numberFollowingApattern {
    public static void main(String[] args) {
        
    }

    static String printMinNumberForPattern(String S){
        // code here
        Stack<Integer> st= new Stack<>();
        int num = 1;
        String ans = "";
        for(int i = 0; S.length() > i; i++){
            char ch = S.charAt(i);
            if(ch == 'D'){
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;
                while(st.size() > 0){
                    ans += st.pop();
                }
            }
        }
        st.push(num);
        while(st.size()>0){
            ans += st.pop();
        }
        return ans;
    }
}
