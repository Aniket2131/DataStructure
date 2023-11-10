import java.util.ArrayList;
import java.util.HashMap;

public class Q1743{
    public static void main(String[] args) {
        
    }

    public void dfs(int st, int pre, HashMap<Integer, ArrayList<Integer>> map, int[] ans, int ind){
        ans[ind] = st;
        ArrayList<Integer> arr = map.get(st);
        for(int el : arr){
            if(pre != el){
                dfs(el, st, map, ans, ind+1);
            }
        }
    }
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length;
        int[] ans = new int[n+1];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int[] ar : adjacentPairs){
            int u = ar[0], v = ar[1];
            if(map.containsKey(u)){
                map.get(u).add(v);
            }
            else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(v);
                map.put(u, arr);
            }
            if(map.containsKey(v)){
                map.get(v).add(u);
            }
            else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(u);
                map.put(v, arr);
            }
        }
        int st = -1;
        for(int el : map.keySet()){
            if(map.get(el).size() == 1){
                st = el;
                break;
            }
        }

        dfs(st, Integer.MIN_VALUE, map, ans, 0);

        return ans;
    }
}