public class checkForChildrenSumProperty {

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

    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root == null) return 1;
        
        if(root.left == null && root.right == null) return 1;
        
        int l = 0, r = 0;
        if(root.left != null) l = root.left.data;
        if(root.right != null) r = root.right.data;
        
        if(l + r != root.data) return 0;
        
        int left = isSumProperty(root.left);
        if(left == 0) return 0;
        int right = isSumProperty(root.right);
        return right;
    }
}
