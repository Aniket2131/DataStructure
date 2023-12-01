public class Q990 {

    public static void main(String[] args) {
        String[] equations = {"c==c","b==d","x!=z"};
        System.out.println(equationsPossible(equations));
    }

    public static int find(int x, int[] parent){

        if(parent[x] == x) return x;
 
        return parent[x] = find(parent[x], parent);
 
    }
 
    public static void union(int x, int y, int[] parent, int[] rank) {
 
        int x_parent = find(x, parent);
        int y_parent = find(y, parent);
 
        if(x_parent == y_parent) return;
 
        if(rank[x_parent] > rank[y_parent]){
            parent[y_parent] = x_parent;
        }
 
        else if(rank[x_parent] < rank[y_parent]) {
            parent[x_parent] = y_parent;
         }
 
         else {
             parent[x_parent] = y_parent;
             rank[x_parent]++;
         }
 
    }
 
     public static boolean equationsPossible(String[] equations) {
 
         int[] parent = new int[26];
 
         for(int i = 0; 26 > i; i++) parent[i] = i;
 
         int[] rank = new int[26];
 
         for(String st : equations) {
             char ch1 = st.charAt(0);
             char ch2 = st.charAt(3);
             char sgn = st.charAt(1);
 
             if(sgn == '!') continue;
 
             union(ch1-'a', ch2-'a', parent, rank);
         }
 
         for(String st : equations) {
             char ch1 = st.charAt(0);
             char ch2 = st.charAt(3);
             char sgn = st.charAt(1);
 
             if(sgn == '=') continue;
 
             int ch3 = find(ch1-'a', parent);
             int ch4 = find(ch2-'a', parent);
 
             if((ch3 + 'a') == (ch4 + 'a')) return false;
         }
 
         return true;
     }

}