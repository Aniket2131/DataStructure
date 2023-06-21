import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class nutsAndBoltsProblem {
    public static void main(String[] args) {
        char nuts[] = { '@', '%', '$', '#', '^' }, bolts[] = { '%', '@', '#', '$', '^' };
        matchPairs(nuts, bolts, nuts.length);
    }

    public static void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; n > i; i++) {
            map.put(nuts[i], i);
        }
        for (int i = 0; n > i; i++) {
            if (map.containsKey(bolts[i])) {
                nuts[i] = bolts[i];
            }
        }
        Arrays.sort(nuts);
        Arrays.sort(bolts);
    }
}
