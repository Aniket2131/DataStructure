import java.util.Arrays;
import java.util.TreeMap;

public class Q3 {
    public static void main(String[] args) {
        // int nums[] = { 9, 8, 8, 0, 1, 4 }, indexDifference = 3, valueDifference = 9;
        // int nums[] = {22,28,50,25},indexDifference=0,valueDifference=28;
        int nums[] = {5,1,4,1},indexDifference=2,valueDifference=4;
        // int nums[] = {1,8,6,10},indexDifference=2,valueDifference=5;
        System.out.println(Arrays.toString(findIndices(nums, indexDifference, valueDifference)));
    }

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
            int n = nums.length;
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int ans[] = new int[2];
            ans[0] = -1;
            ans[1] = -1;
            // map.put(-1,-1);
            for(int i = 0; n > i; i++){
                if(i - indexDifference >= 0){
                    map.put(nums[i - indexDifference], i - indexDifference);
                }
                if(map.size() > 0 && Math.abs(map.lastKey() - nums[i]) >= valueDifference){
                    ans[0] = i;
                    ans[1] = map.get(map.lastKey());
                    return ans;
                }
                if(map.size() > 0 && Math.abs(map.firstKey() - nums[i]) >= valueDifference){
                    ans[0] = i;
                    ans[1] = map.get(map.firstKey());
                    return ans;
                }
            }
            return ans;
    }
}