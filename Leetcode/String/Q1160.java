import java.util.HashMap;

public class Q1160 {
    public static void main(String[] args) {
        String words[] = {"cat","bt","hat","tree"}, chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int n = words.length, m = chars.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : chars.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        for(String st : words){

            HashMap<Character, Integer> map2 = new HashMap<>();
            for(int i = 0; i < st.length(); i++){
                char ch = st.charAt(i);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }
            boolean f = true;
            for(char ch : map2.keySet()){
                if(!map.containsKey(ch) || map.get(ch) < map2.get(ch)) f = false;
            }
            if(f) ans += st.length();

        }
        return ans;
    }
}
