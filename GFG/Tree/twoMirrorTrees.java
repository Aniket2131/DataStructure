public class twoMirrorTrees {
    class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
    public static void main(String[] args) {
        
    }

    boolean areMirror(Node a, Node b) {
        // Your code here
        if(a == null && b == null) return true;
        if((a.left == null && a.right == null) && (b.left != null && b.right != null)) return false;
        if((b.left == null && b.right == null) && (a.left != null && a.right != null)) return false;
        if(a.data != b.data) return false;
        
        if(areMirror(a.left, b.right) == false) return false;
        if(!areMirror(a.right, b.left)) return false;
        
        return true;
    }
}
