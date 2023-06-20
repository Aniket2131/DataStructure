import java.util.HashMap;
import java.util.Map;

public class Q2053 {
    public static void main(String[] args) {
        String[] arr = { "d", "b", "c", "b", "c", "a" };
        System.out.println(kthDistinct(arr, 2));
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String st : arr) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        String ans = "";
        for (String st : arr) {
            if (map.get(st) == 1) {
                ans = st;
                k--;
                if (k == 0)
                    return ans;
            }
        }
        return k > 0 ? "" : ans;
    }
}
