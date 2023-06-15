import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1436 {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>(3);
        paths.add(0, new ArrayList<>());
        paths.add(1, new ArrayList<>());
        paths.add(2, new ArrayList<>());
        paths.get(0).add(0, "London");
        paths.get(0).add(1, "New York");
        paths.get(1).add(0, "New York");
        paths.get(1).add(1, "Lima");
        paths.get(2).add(0, "Lima");
        paths.get(2).add(1, "Sao Paulo");

        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; paths.size() > i; i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        String ans = paths.get(0).get(0);
        while (true) {
            if (map.get(ans) == null)
                break;
            String key = map.get(ans);
            ans = key;
        }
        return ans;
    }
}
