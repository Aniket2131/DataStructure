import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q6927 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        // 3,3,3,3,7,2,2]
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(7);
        nums.add(2);
        nums.add(2);
        System.out.println(minimumIndex(nums));
    }

    public static int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> premap = new HashMap<>();
        
        for(int el : nums) map.put(el, map.getOrDefault(el,0) + 1);
        
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; n > i; i++){
            int el = nums.get(i);
            map.put(el, map.getOrDefault(el, 0) - 1);
            premap.put(el, premap.getOrDefault(el, 0) + 1);
            if(map.get(el) == 0) map.remove(el);
            if(premap.get(el) == 0) premap.remove(el);
            int n1 = 0;
            int n2 = 0;
            if(map.containsKey(el)) n2 = map.get(el);
            
            if(premap.containsKey(el)) n1 = premap.get(el);
                
            if(map.containsKey(el)  && premap.containsKey(el) && n1 + n2 >= 2){
                if(n1 * 2 > i + 1 && n2 * 2 > n - i - 1){
                    ans = Math.min(ans, i);
                }
            }
        }
        return ans == Integer.MAX_VALUE?-1: ans;
    }
}
