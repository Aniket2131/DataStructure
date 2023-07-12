import java.util.ArrayList;
import java.util.List;

public class Q802{
    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println(eventualSafeNodes(graph));
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> ans = new ArrayList<>();
        int[] vis = new int[n];
        int[] pathVis = new int[n];
        int[] check = new int[n];

        for(int i = 0; n > i; i++){
            if(vis[i] == 0){
                dfs(i, vis, pathVis, graph, check);
            }
        }
        for(int i = 0; n > i; i++){
            if(check[i] == 1) ans.add(i);
        }
        return ans;
    }

    public static Boolean dfs(int ind, int[] vis, int[] pathVis, int[][] graph, int[] check){
        vis[ind] = 1;
        pathVis[ind] = 1;
        check[ind] = 0;
        for(int i = 0; graph[ind].length > i; i++){
            if(vis[graph[ind][i]] == 0){
                if(dfs(graph[ind][i], vis, pathVis, graph, check) == true) return true;
            }
            else if(pathVis[graph[ind][i]] == 1) return true;
        }
        check[ind] = 1;
        pathVis[ind] = 0;
        return false;
    }
}