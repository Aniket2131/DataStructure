import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_BFS {
    public static void main(String[] args) {
        
    }

    public static boolean bipartite(int V, ArrayList<ArrayList<Integer>> adj){
        
        int[] color = new int[V+1];
        Arrays.fill(color, -1);

        for(int i = 0; V > i; i++){

            if(color[i] == -1 && bfs( i, adj, color, 1) == false){

                return false;

            }

        }
        
        return true;
    }

    public static boolean bfs(int cur, ArrayList<ArrayList<Integer>> adj, int[] color, int curColor){

        Queue<Integer> q = new LinkedList<>();

        q.add(cur);
        color[cur] = curColor;

        while(!q.isEmpty()){

            int u = q.poll();

            for(int v : adj.get(u)){

                if(color[v] == color[u]) return false;

                else if(color[v] == -1){
                    q.add(v);
                    color[v] = 1 - color[u];
                }

            }

        }

        return true;
    }
}
