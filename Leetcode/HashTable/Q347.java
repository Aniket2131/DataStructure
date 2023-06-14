import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q347 {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        List<Integer>[] lis = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; nums.length > i; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int el : map.keySet()) {
            int f = map.get(el);
            if (lis[f] == null) {
                lis[f] = new ArrayList<>();
            }
            lis[f].add(el);
        }

        int cnt = 0;
        for (int i = lis.length - 1; i >= 0; i--) {
            if (lis[i] != null) {
                for (int j = 0; lis[i].size() > j; j++) {
                    ans[cnt] = lis[i].get(j);
                    cnt++;
                }
            }
            if (cnt == k)
                break;
        }
        return ans;
    }
}
