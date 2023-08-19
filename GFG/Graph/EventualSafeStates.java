import java.util.ArrayList;
import java.util.List;

public class EventualSafeStates {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        int V = 6;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; V > i; i++){
            for(int j = i = 1; V > j; j++){
                adj.get(i).add(j);
                adj.get(j).add(i);
            }
        }
        System.out.println(eventualSafeNodes(V, adj));
    }

    static boolean[] vis;
    static boolean[] isRecursion;
    public static List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        vis = new boolean[V];
        isRecursion = new boolean[V];
        
        for(int i = 0; V > i; i++){
            if(!vis[i]){
                isCycle(i, adj);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; V > i; i++){
            if(!isRecursion[i]) ans.add(i);
        }
        return ans;
    }
    
    public static boolean isCycle(int ind, List<List<Integer>> adj){
        vis[ind] = true;
        isRecursion[ind] = true;
        
        for(int el : adj.get(ind)){
            if(!vis[el] && isCycle(el, adj)) return true;
            
            else if(isRecursion[el]) return true;
        }
        isRecursion[ind] = false;
        return false;
    }
}
