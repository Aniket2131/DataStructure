import java.util.ArrayList;
import java.util.Arrays;

public class Bipartaite_DFS {
    public static void main(String[] args) {
        
    }

    public static boolean bipartaite(int V, ArrayList<ArrayList<Integer>> adj){
        int[] color = new int[V+1];
        Arrays.fill(color, -1);
        for(int u = 0; V > u; u++){

            if(color[u] == -1 && dfs(u, adj, color, 1) == false){
                return false;
            }

        }
        return true;
    }

    public static boolean dfs(int u, ArrayList<ArrayList<Integer>> adj, int[] color, int curColor){

        color[u] = curColor;

        for(int v : adj.get(u)){

            if(color[v] == curColor) return false;
            
            else if(color[v] == -1 && dfs(v, adj, color, 1-curColor) == false) return false;

        }

        return true;
    }
}
