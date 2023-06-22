import java.util.HashSet;
import java.util.Set;

public class Q2399 {
    public static void main(String[] args) {
        String s = "aa";
        int[] distance = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(checkDistances(s, distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        Set<Character> set = new HashSet<>();
        int[] charArr = new int[26];
        for (int i = 0; s.length() > i; i++) {
            char ch = s.charAt(i);
            if (charArr[ch - 'a'] == 0) {
                charArr[ch - 'a'] = i + 1;
            } else {
                charArr[ch - 'a'] = i - charArr[ch - 'a'];
            }
            set.add(ch);
        }
        for (int i = 0; 26 > i; i++) {
            if (set.contains((char) (i + 'a'))) {
                if (charArr[i] != distance[i])
                    return false;
            }
        }
        return true;
    }
}
