import java.util.ArrayList;
import java.util.List;

public class Q6921 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("$easy$");
        words.add("$problem$");
        System.out.println();
        char separator = '$';
        System.out.println(splitWordsBySeparator(words, separator));
        
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans  = new ArrayList<>();
        for(String st : words){
            int i = 0;
            int j = 0;
            while(st.length() > j){
                char ch = st.charAt(j);
                if(ch == separator){
                    if(i == j){
                        i = j + 1;
                    }
                    else{
                        ans.add(st.substring(i, j));
                        i = j+1;
                    }
                }
                j++;
            }
            if(i != j){
                ans.add(st.substring(i, j));
            }
        }
        return ans;
    }
}
