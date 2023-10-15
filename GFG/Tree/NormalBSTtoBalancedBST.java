import java.util.ArrayList;

public class NormalBSTtoBalancedBST {
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

    ArrayList<Node> arr;
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        arr = new ArrayList<>();
        getInorder(root);
        return solve(0, arr.size()-1);
    }
    
    Node solve(int l, int h){
        if(l > h) return null;
        
        int m = l + (h - l)/2;
        
        Node root = arr.get(m);
        
        root.left = solve(l, m-1);
        
        root.right = solve(m+1, h);
        
        return root;
    }
    
    void getInorder(Node root){
        if(root == null) return;
        
        getInorder(root.left);
        arr.add(root);
        getInorder(root.right);
    }
}
