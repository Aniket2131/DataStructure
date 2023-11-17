public class binarytreeToCDLL {
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

    boolean flag;
    Node head;
    Node pre;
    Node bTreeToClist(Node root)
    {
        //your code here
        head = null;
        pre = null;
        flag = true;
        solve(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    
    void solve(Node root){
        if(root == null) return;
        
        solve(root.left);
        
        if(flag){
            flag = false;
            head = root;
            pre = root;
        }
        else{
            pre.right = root;
            root.left = pre;
        }
        pre = root;
        solve(root.right);
    }
}
