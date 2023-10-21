import java.util.ArrayList;

public class rootToLeafPath {
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
    public ArrayList<ArrayList<Integer>> Paths(Node root){
        // Code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>();
        solve(root, ans, new ArrayList<>());
        return ans;
    }
    
    public void solve(Node root, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr){
        if (root == null)
            return;
        arr.add(root.data);
        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<Integer>(arr));
            return;
        }
        solve(root.left, ans,new ArrayList<Integer>(arr));
        solve(root.right, ans,new ArrayList<Integer>(arr));
    }
    
}
