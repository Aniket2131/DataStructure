import java.util.HashMap;
import java.util.Map;

public class twiceCounter {
    public static void main(String[] args) {
        String[] list = { "Geeks", "For", "Geeks" };
        System.out.println(countWords(list, list.length));
    }

    public static int countWords(String list[], int n) {
        // code here
        Map<String, Integer> map = new HashMap<>();
        for (String st : list) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        int ans = 0;
        for (String st : map.keySet()) {
            if (map.get(st) == 2)
                ans++;
        }
        return ans;
    }
}
