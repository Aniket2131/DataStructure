import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum4{
    public static void main(String[] args) {
        int nums[] = {2,2,2,2,2}, target = 8;
        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; n > i; i++){
            for(int j = i+1; n > j; j++){
                Set<Integer> s = new HashSet<>();
                for(int k = j+1; n > k; k++){
        
                    if(s.contains(target - nums[i] + nums[j] + nums[k])){
                        List<Integer> il = new ArrayList<>();
                        il.add(nums[i]);
                        il.add(nums[j]);
                        il.add(nums[k]);
                        il.add(target - nums[i] + nums[j] + nums[k]);
                        Collections.sort(il);
                        if(!set.contains(il)){
                            ans.add(il);;
                            set.add(il);
                        }
                    }
                    s.add(nums[k]);
                }
            }
        }
        return ans;
    }
}