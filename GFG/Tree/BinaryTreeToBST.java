import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreeToBST {
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

    int ind;
    Node binaryTreeToBST(Node root)
    {
       // Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root, arr);
        Collections.sort(arr);
        ind = 0;
        turnBST(root, arr);
        return root;
    }
    
    void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        
        getInorder(root.left, arr);
        
        arr.add(root.data);
        
        getInorder(root.right, arr);
    }
    
    void turnBST(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        
        turnBST(root.left, arr);
        
        root.data = arr.get(ind);
        ind+=1;
        turnBST(root.right,arr);
    } 
}
