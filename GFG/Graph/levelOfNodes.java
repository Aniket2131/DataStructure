import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOfNodes{
    public static void main(String[] args) {
        
    }

    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        q.offer(0);
        int l = 0;
        while(!q.isEmpty()){
            int n = q.size();
        
            for(int i = 0; n > i; i++){
                int num = q.poll();
                if(num == X) return l;
                for(int j = 0; adj.get(num).size() > j; j++){
                    int el = adj.get(num).get(j);
                    if(!arr.contains(el)){
                        arr.add(el);
                        q.add(el);
                    }
                }
            }
            l++;
        }
        return -1;
    }
}