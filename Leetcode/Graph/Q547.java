import java.util.ArrayList;

public class Q547{
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(isConnected));
    }

    public static boolean[] vis;
    public static ArrayList<ArrayList<Integer>> adj;
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        vis = new boolean[n];
        adj = new ArrayList<>();
        for(int i = 0; n > i; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; n > i; i++){
            for(int j = 0; n > j; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int ans = 0;
        for(int i = 0; n > i; i++){
            if(!vis[i]){
                ans++;
                dfs(i);
            }
        }
        return ans;
    }

    public static void dfs(int ind){
        vis[ind] = true;
        for(Integer el : adj.get(ind)){
            if(!vis[el]){
                dfs(el);
            }
        }
    }
}