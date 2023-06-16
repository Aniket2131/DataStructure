import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class winnerOfAnElection {
    public static void main(String[] args) {
        String Votes[] = { "john", "johnny", "jackie", "johnny", "john",
                "jackie", "jamie", "jamie", "john", "johnny", "jamie",
                "johnny", "john" };

        System.out.println(Arrays.toString(winner(Votes, 13)));
    }

    public static String[] winner(String arr[], int n) {
        // add your code
        String[] ans = new String[2];
        Map<String, Integer> map = new HashMap<>();
        for (String el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        String Name = "";
        int cnt = 0;
        for (String el : map.keySet()) {
            if (map.get(el) > cnt) {
                Name = el;
                cnt = map.get(el);
            } else if (map.get(el) == cnt) {
                if (Name.compareTo(el) > 0)
                    Name = el;
            }
        }
        ans[0] = Name;
        ans[1] = Integer.toString(cnt);
        return ans;
    }
}
