import java.util.HashMap;

public class Q1838{
    public static void main(String[] args) {
        int nums[] = {1,2,4}, k = 5;
        System.out.println(maxFrequency(nums, k));
    }

    public static int maxFrequency(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; nums.length > i; i++){
            int el = nums[i];
            map.put(el, map.getOrDefault(el, 0)+1);
            nums[i] += 1;
        }
        int ans = Integer.MIN_VALUE;    
        for(int i = 0; k-1 > i; i++){
            for(int j = 0; nums.length > j; j++){
                if(map.containsKey(nums[j])){
                    map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
                    ans = Math.max(ans, map.get(nums[j]));
                    if(map.get(nums[j]) == nums.length) return ans;
                }
                nums[j] += 1;
            }
        }
        return ans;
    }
}