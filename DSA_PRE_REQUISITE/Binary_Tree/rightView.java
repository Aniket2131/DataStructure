public class rightView {
    class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
    public static void main(String[] args) {
        
    }

    // ArrayList<Integer> rightView(Node node) {
    //     //add code here.
    //     ArrayList<Integer> ans  = new ArrayList<>();
    //     solve(node, 0, ans);
    //     return ans;
    // }
    
    // void solve(Node root, int lev, ArrayList<Integer> ans){
    //     if(root == null) return;
        
    //     if(lev == ans.size()) ans.add(root.data);
        
    //     solve(root.right, lev+1, ans);
    //     solve(root.left, lev+1, ans);
    // }
}
