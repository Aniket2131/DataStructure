public class Q1319 {
    public static void main(String[] args) {
        
    }

    public int find(int x, int[] parent){

        if(x == parent[x]) return x;

        return parent[x] = find(parent[x], parent);
    }

    public void union(int x, int y, int[] parent, int[] rank){

        int x_parent = find(x, parent);
        int y_parent = find(y, parent);

        if(x_parent == y_parent) return;

        if(rank[x_parent] > rank[y_parent]){
            parent[y_parent] = x_parent;
        }

        else if(rank[x_parent] < rank[y_parent]){
            parent[x_parent] = y_parent;
        }

        else {
            parent[x_parent] = y_parent;
            rank[x_parent]++;
        }
    }

    public int makeConnected(int n, int[][] connections) {
        int m = connections.length;
        if(n-1 > m) return -1;

        int[] parent = new int[n];
        for(int i = 0; n > i; i++) parent[i] = i;
        int[] rank = new int[n];

        int cnt = n;
        for(int i = 0; m > i; i++){
            int a = connections[i][0];
            int b = connections[i][1];

            int a_parent = find(a, parent);
            int b_parent = find(b, parent);

            if(a_parent != b_parent){
                union(a_parent, b_parent, parent, rank);
                cnt--;
            }
            
        }

        return cnt-1;
    }
}
