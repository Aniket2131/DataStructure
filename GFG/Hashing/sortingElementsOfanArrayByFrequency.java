import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sortingElementsOfanArrayByFrequency {
    public static void main(String[] args) {
        int A[] = { 5, 5, 4, 6, 4 };
        System.out.println(sortByFreq(A, A.length));
    }

    public static ArrayList<Integer> sortByFreq(int arr[], int n) {
        // add your code here
        Map<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int el : map.keySet()) {
            for (int i = 0; map.get(el) > i; i++) {
                ans.add(el);
            }
        }

        Collections.sort(ans, (a, b) -> {
            return map.get(a) != map.get(b) ? map.get(b) - map.get(a) : a - b;
        });
        return ans;
    }
}
