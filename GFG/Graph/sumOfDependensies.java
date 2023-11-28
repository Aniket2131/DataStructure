import java.util.ArrayList;

public class sumOfDependensies {
    public static void main(String[] args) {
        
    }

    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int ans = 0;
        
        for(int i = 0; adj.size() > i; i++){
            
            for(int v : adj.get(i)){
                ans++;
            }
        }
        
        return ans;
    }
}
