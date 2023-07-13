import java.util.ArrayList;

public class Q207 {
    public static void main(String[] args) {
        int numCourses = 2, prerequisites[][] = {{1,0}};
        System.out.println(canFinish(numCourses , prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        int[] vis = new int[n];
        int[] pathVis = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; n > i; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] el: prerequisites){
            adj.get(el[1]).add(el[0]);
        }

        for(int i = 0; n > i; i++){
            if(vis[i] == 0 && dfs(i, adj, vis, pathVis)){
                return false;
            }
        }
        return true;
    }

    public static Boolean dfs(int ind, ArrayList<ArrayList<Integer>> adj, int[] vis , int[] pathVis){
        vis[ind] = 1;
        pathVis[ind] = 1;
        for(int el : adj.get(ind)){
            if(vis[el] == 0 && dfs(el, adj, vis, pathVis)) return true;
            else if(pathVis[el] == 1) return true; 
        }
        pathVis[ind] = 0;
        return false;
    }
}
