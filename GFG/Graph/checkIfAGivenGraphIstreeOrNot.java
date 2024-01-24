import java.util.ArrayList;

public class checkIfAGivenGraphIstreeOrNot{
    public static void main(String[] args) {
        
    }

    public boolean dfs(int u, ArrayList<ArrayList<Integer>> adj, boolean[] v, int[] p){
        
        v[u] = true;
        
        for(int el : adj.get(u)){
            
            if(!v[el]){
                p[el] = u;
                if(!dfs(el, adj, v, p)) return false;
            }
            else if(p[u] != el) return false;
        }
        return true;
    }
    
    public  boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; n > i; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; m > i; i++){
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] v = new boolean[n];
        int[] p = new int[n];
        p[0] = -1;
        
        int cmp = 0;
        for(int i = 0; n > i; i++){
            if(!v[i]){
                cmp++;
                if(!dfs(i, adj, v, p)) return false;
            }
        }
        
        if(cmp != 1) return false;
        return true;
    }
}