import java.util.HashMap;

public class RepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(firstRep("go"));
    }

    public static char firstRep(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = S.length() - 1; i >= 0; i--) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (Character ch : S.toCharArray()) {
            if (map.containsKey(ch)) {
                if (map.get(ch) > 1) {
                    return ch;
                }
            }
        }
        return '#';
    }

}
