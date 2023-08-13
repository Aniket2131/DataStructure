import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Q2817 {
    public static void main(String[] args) {
        int x = 2;
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(minAbsoluteDifference(nums, x));
    }

    public static int minAbsoluteDifference(List<Integer> nums, int x) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = x; n > i; i++){
            set.add(nums.get(i - x));
            Integer h = set.ceiling(nums.get(i)), l = set.floor(nums.get(i));
            if(h != null) ans = Math.min(ans, Math.abs(h - nums.get(i)));
            if(l != null) ans = Math.min(ans, Math.abs(l - nums.get(i)));
        }
        return ans;
    }
}
