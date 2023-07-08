import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q6469 {
    public static void main(String[] args) {
        int[] nums = {1,6,7,8}, moveFrom = {1,7,2}, moveTo = {2,9,5};
        System.out.println(relocateMarbles(nums, moveFrom, moveTo));
    }

    public static List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el : nums){
            map.put(el, 1);
        }
        for(int i = 0; moveFrom.length > i; i++){
            if(map.containsKey(moveFrom[i])){
                map.remove(moveFrom[i]);
                map.put(moveTo[i], 1);
            }
        }
        for(int el : map.keySet()){
            ans.add(el);
        }
        Collections.sort(ans);
        return ans;
    }
}
