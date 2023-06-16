import java.util.HashMap;
import java.util.Map;

public class arraySubsetOfAnotherArray {
    public static void main(String[] args) {
        long[] a1 = { 11, 7, 1, 13, 21, 3, 7, 3 };
        long[] a2 = { 11, 3, 7, 1, 7 };
        System.out.println(isSubset(a1, a2, a1.length, a2.length));
    }

    public static String isSubset(long a1[], long a2[], long n, long m) {
        Map<Long, Long> map1 = new HashMap<>();
        Map<Long, Long> map2 = new HashMap<>();
        for (Long el : a1) {
            map1.put(el, map1.getOrDefault(el, (long) 0) + 1);
        }
        for (Long el : a2) {
            map2.put(el, map2.getOrDefault(el, (long) 0) + 1);
        }
        for (Long el : map2.keySet()) {
            if (!map1.containsKey(el))
                return "No";
            if (map2.get(el) > map1.get(el))
                return "No";
        }
        return "Yes";
    }
}
