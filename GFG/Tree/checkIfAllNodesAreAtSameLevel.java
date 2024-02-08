public class checkIfAllNodesAreAtSameLevel {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        
    }

    boolean f;
    int lev;
    
    boolean solve(Node root, int cnt){
        if(root == null) return true;
        
        if(root.left == null && root.right == null){
            if(f){
                f = false;
                lev = cnt;
                return true;
            }
            else{
                if(lev == cnt) return true;
                return false;
            }
        }
        
        boolean l = solve(root.left, cnt+1);
        if(!l) return false;
        boolean r = solve(root.right, cnt+1);
        return r;
    }
    
    boolean check(Node root)
    {
	    // Your code here
	    f = true;
	    lev = 0;
	    
	    return solve(root, 0); 
    }
}
