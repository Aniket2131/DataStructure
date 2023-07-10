public class mirrorTree{
    class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
    public static void main(String[] args) {
        
    }}

    void mirror(Node node) {
        // Your code here
        if(node == null) return;
        if(node.left == null && node.right == null) return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        
        mirror(node.left);
        mirror(node.right);
        
    }
}