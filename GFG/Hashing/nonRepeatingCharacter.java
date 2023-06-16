import java.util.HashMap;
import java.util.Map;

public class nonRepeatingCharacter {
    public static void main(String[] args) {
        String S = "hello";
        System.out.println(nonrepeatingCharacter(S));
    }

    public static char nonrepeatingCharacter(String S) {
        // Your code here
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : S.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Character ch : S.toCharArray()) {
            if (map.get(ch) == 1)
                return ch;
        }
        return '$';
    }
}
