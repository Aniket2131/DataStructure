import java.util.ArrayList;

public class detectCycleInADirectedGraph{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 3;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; V > i; i++){
            for(int j = i = 1; V > j; j++){
                adj.get(i).add(j);
                adj.get(j).add(i);
            }
        }
        System.out.println(isCyclic(V, adj));
    }

    static boolean[] vis;
    static boolean[] isRecursion;
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        vis = new boolean[V];
        isRecursion = new boolean[V];
        for(int i = 0; V > i; i++){
            if(!vis[i] && dfs(i, adj)) return true;
        }
        return false;
    }
    
    public static boolean dfs(int ind, ArrayList<ArrayList<Integer>> adj){
        vis[ind] = true;
        isRecursion[ind] = true;
        
        for(Integer el : adj.get(ind)){
            if(!vis[el] && dfs(el, adj)){
                return true;
            }
            else if(isRecursion[el]) return true;
        }
        isRecursion[ind] = false;
        return false;
    }
}