import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class smallestDistinctWindow {
    public static void main(String[] args) {
        String str = "AABBBCBBAC";
        System.out.println(findSubString(str));
    }

    public static int findSubString(String str) {
        // Your code goes here
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray())
            set.add(ch);

        int n = set.size();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 1;
        int ans = Integer.MAX_VALUE;
        map.put(str.charAt(i), 1);
        int cnt = 1;
        while (j >= i && str.length() > j) {
            if (n > cnt) {
                if (!map.containsKey(str.charAt(j)))
                    cnt++;
                map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
                j++;
            } else if (cnt == n) {
                ans = Math.min(ans, j - i);
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) - 1);
                if (map.get(str.charAt(i)) == 0) {
                    cnt--;
                    map.remove(str.charAt(i));
                }
                i++;
            }
        }

        while (cnt == n) {
            ans = Math.min(ans, j - i);
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) - 1);
            if (map.get(str.charAt(i)) == 0) {
                cnt--;
                map.remove(str.charAt(i));
            }
            i++;
        }
        return ans;
    }
}
