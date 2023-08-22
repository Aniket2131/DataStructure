import java.util.List;

public class Q7004 {
    public static void main(String[] args) {
        String words[] = {"alice","bob","charlie"}, s = "abc";
        System.out.println(isAcronym(words, s));
    }

    public static boolean isAcronym(String[] words, String s) {
        String ans = "";
        for(String st: words){
            ans += st.charAt(0);
        }
        return ans.equals(s);
    }
}
