import java.util.HashMap;
import java.util.Map;

public class substringsWithSameFirstAndLastCharacters {
    public static void main(String[] args) {

    }

    public static int countSubstringWithEqualEnds(String s) {
        // code here
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : map.keySet()) {
            int n = map.get(ch);
            ans += ((n + 1) * n) / 2;
        }
        return ans;
    }
}
