public class DSU {
    public static void main(String[] args) {
        
    }

    // Find Operation Using Path Compresion

    public int find(int x, int[] parent){
        if(parent[x] == x) return x;

        return parent[x] = find(parent[x], parent);
    }

    // Union operation using rank array

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
            rank[y_parent]++;
        }
    }
}