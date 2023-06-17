import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q1207 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        for (int el : map.keySet()) {
            set.add(map.get(el));
        }
        return set.size() == map.size();
    }
}