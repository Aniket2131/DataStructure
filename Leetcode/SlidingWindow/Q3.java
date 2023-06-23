import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        while (s.length() > j) {
            char ch = s.charAt(j);
            if (set.contains(ch)) {
                char cha = s.charAt(i);
                set.remove(cha);
                i++;
            } else {
                set.add(ch);
                ans = Math.max(ans, set.size());
                j++;
            }
        }
        return ans;
    }
}