import java.util.HashMap;
import java.util.Map;

public class Q1876 {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }

    // normal approach

    public static int countGoodSubstrings(String s) {
        if (3 > s.length())
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; 3 > i; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int ans = 0;
        if (map.size() == 3)
            ans++;
        for (int i = 3; s.length() > i; i++) {
            map.put(s.charAt(i - 3), map.getOrDefault(s.charAt(i - 3), 0) - 1);
            if (0 >= map.get(s.charAt(i - 3)))
                map.remove(s.charAt(i - 3));
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (map.size() >= 3)
                ans++;
        }
        return ans;
    }

    // Method - 2

    // public static int countGoodSubstrings(String s) {
    // int ans = 0;
    // for(int i = 2; s.length() > i; i++){
    // if(s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 2) &&
    // s.charAt(i - 2) != s.charAt(i - 1)) ans++;
    // }
    // return ans;

    // }
}