import java.util.HashMap;
import java.util.Map;

public class Q6939 {
    public static void main(String[] args) {
        int[] nums =  {68,8,100,84,80,14,88};
        System.out.println(maxSum(nums));
    }

    public static int maxSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = -1;
        for(int i = 0; n > i; i++){
            int b = findBig(nums[i]);
            if(map.containsKey(b)){
                int ind = map.get(b);
                int a = nums[ind];
                int c = nums[i];
                ans = Math.max(ans, a + c);
                if(a > c){
                    map.put(b, ind);
                }
                else{
                    map.put(b, i);
                }
            }
            else{
                map.put(b, i);
            }
        }
        return ans;
    }
    
    public static int findBig(int n){
        int l = 0;
        while(n != 0){
            int r = n % 10;
            l = Math.max(r, l);
            n /= 10;
        }
        return l;
    }
}
