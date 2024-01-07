import java.util.HashMap;

public class Q446 {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        // int[] nums = {7, 7, 7, 7, 7};
        // int[] nums = {0,2000000000,-294967296};
    
        System.out.println(numberOfArithmeticSlices(nums));
    }

    public static int numberOfArithmeticSlices(int[] nums) {
        int n  = nums.length;
        if(n < 3) return 0;
        HashMap<Long, Integer>[] map = new HashMap[n];
        int ans = 0;
        for(int i = 0; n > i; i++){
            map[i] = new HashMap<>();
            int cnt = 0;
            for(int j = 0; j < i; j++){

                long dif = (long) nums[i] - nums[j];
                HashMap<Long, Integer> m = map[j];
                HashMap<Long, Integer> m1 = map[i];
                if(m.containsKey(dif)){
                    int v = m.get(dif);
                    cnt += v;
                    int v1 = 0;
                    if(m1.containsKey(dif)) v1 = m1.get(dif);
                    m1.put(dif,  v1+v+1);
                }
                else{
                    m1.put(dif, m1.getOrDefault(dif, 0)+1);
                }

            }
            ans += cnt;
        } 
        return ans;        
    }
}
