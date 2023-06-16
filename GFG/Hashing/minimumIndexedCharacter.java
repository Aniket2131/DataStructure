import java.util.HashMap;
import java.util.Map;

public class minimumIndexedCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String patt = "set";
        System.out.println(minIndexChar(str, patt));
    }

    public static int minIndexChar(String str, String patt) {
        // Your code here
        Map<Character, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; str.length() > i; i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
            }
        }
        for (Character ch : patt.toCharArray()) {
            if (map.containsKey(ch)) {
                ans = Math.min(ans, map.get(ch));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
