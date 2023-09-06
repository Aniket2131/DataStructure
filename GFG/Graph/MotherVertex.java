import java.util.ArrayList;
import java.util.Arrays;

public class MotherVertex {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; 5 > i; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(0, 2);
        adj.get(0).add(1, 3);
        adj.get(1).add(0);
        adj.get(2).add(1);
        adj.get(3).add(4);
        System.out.println(adj);
        int V = 5;
        System.out.println(findMotherVertex(V, adj));
    }


    public static int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        boolean[] vis = new boolean[V];
        int lastnode = 0;
        for(int i = 0; V > i; i++){
            if(!vis[i]){
                dfs(i, adj, vis);
                lastnode = i;
            }
        }
        Arrays.fill(vis, false);
        dfs(lastnode, adj, vis);
        for(int i = 0; V > i; i++){
            if(!vis[i]) return -1;
        }
        return lastnode;
    }
    
    public static void dfs(int ind, ArrayList<ArrayList<Integer>>adj, boolean[] vis){
        vis[ind] = true;
        for(Integer el :adj.get(ind)){
            if(vis[el] == false){
                dfs(el, adj, vis);    
            }
        }
    }
}
