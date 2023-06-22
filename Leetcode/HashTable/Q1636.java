import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q1636 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 3 };
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
            list.add(el);
        }
        Collections.sort(list, (a, b) -> (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b));
        int[] ans = new int[nums.length];
        for (int i = 0; nums.length > i; i++)
            ans[i] = list.get(i);
        return ans;
    }
}