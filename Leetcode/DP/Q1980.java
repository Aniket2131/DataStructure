import java.util.HashSet;

public class Q1980{
    public static void main(String[] args) {
        String nums[] = {"00","01"};
        System.out.println(findDifferentBinaryString(nums));
    }

    static HashSet<String> set;
    static String ans;
    static int n;
    public static String findDifferentBinaryString(String[] nums) {
        n = nums.length;
        set = new HashSet<>();
        ans = "";
        for(String st: nums){
            set.add(st);
        }
        solve(0, "");
        return ans;
    }

    public static boolean solve(int ind, String st){
        if(ind >= n){
            if(!set.contains(st)){
                ans = st;
                return true;
            }
            return false;
        }
        boolean flag = false;
        flag = solve(ind+1, st + '0');
        if(flag) return true;
        flag = solve(ind+1, st + '1');
        return flag;
    }
}