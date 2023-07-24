import java.util.ArrayList;

public class printBSTElementsInGivenRange {

    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        
        printNearNodes(root, low, high, ans);
        
        return ans;
    }
    
    public static void printNearNodes(Node root,int low,int high, ArrayList<Integer> ans) {
        // code here.
        if(root == null) return;
        printNearNodes(root.left, low, high, ans);
        if(root.data >= low && high >= root.data) ans.add(root.data);
        printNearNodes(root.right, low, high, ans);
    }
}
