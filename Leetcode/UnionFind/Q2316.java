import java.util.HashMap;

public class Q2316 {
    public static void main(String[] args) {
        int[][] edges = {{0,2},{0,5},{2,4},{1,6},{5,4}};
        int n = 7;
        // int[][] edges = {{5,0},{1,0},{10,7},{9,8},{7,2},{1,3},{0,2},{8,5},{4,6},{4,2}};
        // int n = 11;        
        System.out.println(countPairs(n, edges));
    }

    public static int find(int x, int[] parent){
        if(parent[x] == x) return x;

        return parent[x] = find(parent[x], parent);
    }

    public static void union(int x, int y, int[] parent, int[] rank){
        int x_par = find(x, parent);
        int y_par = find(y, parent);

        if(x_par == y_par) return;

        if(rank[x_par] > rank[y_par]){
            parent[y_par] = x_par;
        }
        
        else if(rank[x_par] < rank[y_par]){
            parent[x_par] = y_par;
        }

        else {
            parent[x_par] = y_par;
            rank[y_par]++;
        }
    }
    public static long countPairs(int n, int[][] edges) {
        int[] parent = new int[n];
        int[] rank = new int[n];

        for(int i =0; n > i; i++) parent[i] = i;

        for(int[] arr: edges){
            int x = arr[0];
            int y = arr[1];

            union(x, y, parent, rank);
        }

        HashMap<Integer, Long> map = new HashMap<>();
        for(int i = 0; n > i; i++){
            int par = find(i, parent);
            map.put(par, map.getOrDefault(par, (long)0)+1);
        }
        long ans = 0;
        long rem = n;
        for(int  el : map.keySet()){
            long s = map.get(el);
            ans += s * (rem - s);
            rem -= s; 
        }

        return ans;
    }
}
