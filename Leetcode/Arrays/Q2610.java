import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2610 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        ans.add(new ArrayList<>());
        while(i < n){
            ans.get(0).add(nums[i]);
            int cnt = 1;
            int el = nums[i++];
            while(i < n && el == nums[i]){
                if(ans.size() <= cnt){
                    ans.add(cnt, new ArrayList<>());
                }
                ans.get(cnt).add(nums[i]);
                i++;
                cnt++;
            }
        }

        return ans;
    }
}
