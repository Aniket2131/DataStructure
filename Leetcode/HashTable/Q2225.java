import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
public class Q2225 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        TreeMap<Integer, Integer> w = new TreeMap<>();
        TreeMap<Integer, Integer> l = new TreeMap<>();
        TreeMap<Integer, Integer> t = new TreeMap<>();

        for(int[] arr : matches){

            int wi = arr[0], lo = arr[1];
            l.put(lo, l.getOrDefault(lo, 0)+1);
            w.put(wi, w.getOrDefault(wi, 0) +1);
            t.put(lo, t.getOrDefault(lo, 0)+1);
            t.put(wi, t.getOrDefault(wi, 0)+1);

        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for(int el : w.keySet()){
            if(w.get(el) == t.get(el)) ans.get(0).add(el);
        }
        for(int el : l.keySet()){
            if(l.get(el) == 1) ans.get(1).add(el);
        }
        return ans;
    }
}
