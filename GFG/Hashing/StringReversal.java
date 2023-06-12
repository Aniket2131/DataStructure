import java.util.HashSet;
import java.util.Set;

public class StringReversal {
    public static void main(String[] args) {
        String s = "GEEKS FOR GEEKS";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String ans = "";
        Set<Character> set = new HashSet<>();
        for (Character ch : s.toCharArray()) {
            if (ch != ' ') {
                set.add(ch);
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (set.contains(s.charAt(i))) {
                ans += s.charAt(i);
                set.remove(s.charAt(i));
            }
        }
        return ans;
    }
}
