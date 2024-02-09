import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q368{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        
        System.out.println(largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = nums.length, ind = -1, s = -1;
        Arrays.sort(nums);
        for(int i = 0; n > i; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int j = 0; j < i; j++){
                int el = nums[j];
                if(nums[i] % el == 0 && map.get(j).size() > arr.size()){
                    arr = map.get(j);
                }
            }
            ArrayList<Integer> ar = new ArrayList<>();
            ar.addAll(arr);
            ar.add(nums[i]);
            if(ar.size() > s){
                ind = i;
                s = ar.size();
            }
            map.put(i, ar);
        }
        return map.get(ind);
    }
}