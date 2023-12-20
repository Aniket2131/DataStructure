import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra{
    public static void main(String[] args) {
        int V = 2;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(9);
        adj.add(new ArrayList<>());
        adj.get(0).add(arr);
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(0);
        arr1.add(9);
        adj.add(new ArrayList<>());
        adj.get(1).add(arr1);
        int S = 0;
        System.out.println(dijkstra(V, adj, S));
    }

    public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int[] ans = new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[S] = 0;
        
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0]) return a[1]-b[1];
            return a[0] - b[0];
        });
                             
        q.add(new int[]{0, S});
        
        while(!q.isEmpty()){
            int[] temp = q.poll();
            
            int d = temp[0], n = temp[1];
            
            for(ArrayList<Integer> arr: adj.get(n)){
                int D = arr.get(1), N = arr.get(0);
                int t = d + D;
                
                if(t < ans[N]){
                    ans[N] = t;
                    q.add(new int[]{t, N});
                }
            }
        }
        return ans;
    }
}