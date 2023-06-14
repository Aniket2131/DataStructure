import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2418 {
    public static void main(String[] args) {
        String[] names = { "Mary", "John", "Emma" };
        int[] heights = { 180, 165, 170 };
        System.out.println(sortPeople(names, heights));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; names.length > i; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= 0; i--) {
            names[heights.length - i - 1] = map.get(heights[i]);
        }
        return names;
    }
}
