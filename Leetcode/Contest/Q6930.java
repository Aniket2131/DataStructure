import java.util.HashSet;
import java.util.Set;

public class Q6930 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 2};
        System.out.println(isGood(nums));
    }

    public static boolean isGood(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int el : nums){
            max = Math.max(el, max);
            set.add(el);
        }
        if(n > max + 1) return false;
        int c = 0;
        for(int i = 1; max > i; i++){
            if(!set.contains(i)){
                return false;
            }
        }
        for(int i = 0; n > i; i++) if(nums[i] == max) c++;
        
        return c != 2 ? false: true; 
        
    }
}
