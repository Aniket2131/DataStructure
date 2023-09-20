import java.util.HashMap;

public class Q1658{
    public static void main(String[] args) {
        
    }

    
    public int minOperations(int[] nums, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;
        int n = nums.length;
        map.put(0, -1);
        for(int i = 0; n > i; i++){
            total += nums[i];
            map.put(total, i);
        }
        if(total < x) return -1;

        int rem = total - x;
        total = 0;
        int len = -1; 
        for(int i = 0; nums.length > i; i++){
            total += nums[i];
            int find = total - rem;
            if(map.containsKey(find)){
                int ind = map.get(find);
                len = Math.max(len, i-ind);
            }
        }

        return len == -1? -1: n - len;
    }
}