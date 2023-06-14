import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 3, 5, 6 };
        System.out.println(firstRepeated(arr, arr.length));
    }

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; n > i; i++) {
            if (map.containsKey(arr[i])) {
                ans = Math.min(ans, map.get(arr[i]));
            } else {
                map.put(arr[i], i + 1);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
