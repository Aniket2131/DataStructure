import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class topologicalSort{
    public static void main(String[] args) {
        
    }
    static Stack<Integer> s;
    static Boolean[] vis;
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int ind = 0;
        s = new Stack<>();
        int[] ans = new int[V];
        vis = new Boolean[V + 1];
        Arrays.fill(vis, false);
        for(int i = 0; V > i; i++){
            if(!vis[i]){
                dfs(i,adj);
            }
        }
        while(!s.isEmpty()){
            ans[ind++] = s.pop();
        }
        return ans;
    }
    
    static void dfs(int u, ArrayList<ArrayList<Integer>> adj){
        if(vis[u]) return;
        
        vis[u] = true;
        
        for(int v : adj.get(u)){
            if(!vis[v]){
                dfs(v, adj);
            }
        }
        s.add(u);
    }
}