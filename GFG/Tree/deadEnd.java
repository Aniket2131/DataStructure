public class deadEnd {
    class Node
{
    int data;
    Node left;
    Node right;
    int height;

    Node (int data){
        this.data = data;
    }
};
    public static void main(String[] args) {
        
    }

    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        return solve(root, 1, 10002);
    }
    
    public static boolean solve(Node root, int l, int h) {
        
        if(l == h) {
            
            return true;
        }
        if(root == null) return false;
        boolean ans = false;
        
        if(root.left != null) ans = solve(root.left, l, root.data - 1);
        
        if(ans) return true;
        
        if(root.right != null) ans = solve(root.right, root.data + 1, h);
        
        return ans;
    }
}