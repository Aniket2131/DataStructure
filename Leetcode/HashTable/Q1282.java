import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1282 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> ind = new HashMap<>();
        for(int i = 0; groupSizes.length > i; i++){
            int el = groupSizes[i];
            if(ind.containsKey(el)){
                int index = ind.get(el);
                if(ans.get(index).size() < el){
                    ans.get(index).add(i);

                }
                else{
                    ans.add(new ArrayList<>());
                    ans.get(ans.size() - 1).add(i);
                    ind.put(el, ans.size() - 1);
                } 
            }
            else{
                ind.put(el, ans.size());
                ans.add(new ArrayList<>());
                ans.get(ans.size() - 1).add(i);
            }
        }
        return ans;
    }
}
