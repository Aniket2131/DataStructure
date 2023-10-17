import java.util.ArrayList;
import java.util.List;

public class Q8039 {
    public static void main(String[] args) {
        List<Integer> nums  = new ArrayList<>();
        // nums.add(3);
        // nums.add(4);
        // nums.add(5);
        // nums.add(1);
        // nums.add(2);

        // [31,72,79,25]
        System.out.println(minimumRightShifts(nums));
    }

    public static int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        for(int i = 0; n > i; i++){
            if(sorted(nums)){
                if(i == 0) return 0;
                else return i-1;
            }
            else{
                for(int j = 0; n - 1 > j; j++){
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, temp);
                }
            }
        }
        return -1;
    }
    
    public static boolean sorted(List<Integer> nums){
        for(int i = 0; nums.size()-1 > i; i++){
            if(nums.get(i) > nums.get(i+1)){
                return false;
            }
        }
        
        return true;
    }
}
