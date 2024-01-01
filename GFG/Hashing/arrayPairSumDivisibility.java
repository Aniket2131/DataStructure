import java.util.HashMap;

public class arrayPairSumDivisibility {
    public static void main(String[] args) {
        
    }

    public boolean canPair(int[] nums, int k) {
        // Code here
        int n = nums.length;
        if(n%2 != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int el: nums){
            
            int rem = el % k;
            if(rem == 0){
                if(map.containsKey(0)){
                    map.put(rem, map.getOrDefault(rem, 0) -1);
                    if(map.get(rem) == 0) map.remove(rem);
                }
                else{
                    map.put(rem, map.getOrDefault(rem, 0)+1);
                }
            }
            else if(map.containsKey(k - rem)){
                
                map.put(k - rem, map.getOrDefault(k - rem, 0) -1);
                if(map.get(k-rem) == 0) map.remove(k-rem);
                
            }
            else {
                map.put(rem, map.getOrDefault(rem, 0)+1);
            }
            
        }
        
        return map.size() == 0 ?  true: false;
    }
}