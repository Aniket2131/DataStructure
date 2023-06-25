import java.util.HashSet;
import java.util.Set;

public class Q6892 {
    public static void main(String[] args) {
        String[] words = { "cd", "ac", "dc", "ca", "zz" };
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int ans = 0;
        for (String st : words) {
            if (set.contains(st)) {
                ans++;
            } else {
                char a = st.charAt(0);
                char b = st.charAt(1);
                set.add("" + b + a);
            }
        }
        return ans;
    }
}