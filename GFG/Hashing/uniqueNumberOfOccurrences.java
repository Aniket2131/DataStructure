import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class uniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {1, 1, 2, 5, 5};
        System.out.println(isFrequencyUnique(N, arr));
    }

    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int el : arr) map.put(el, map.getOrDefault(el, 0) + 1);
        
        for(int el : map.keySet()){
            if(set.contains(map.get(el))) return false;
            else{
                set.add(map.get(el));
            } 
        }
        return true;
    }
}
