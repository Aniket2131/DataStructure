import java.util.List;

public class eulerCircuitAndeulerPath {
    public static void main(String[] args) {
        
    }

    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        // code here
        int cnt  = 0;
        for(int i = 0; V > i; i++){
            if(adj[i].size() % 2 == 0) cnt++;
        }
        
        if(cnt == V) return 2;
        if(V-cnt == 2) return 1;
        return 0;
    }
}
