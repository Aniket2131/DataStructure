public class ceilBinaryTree {
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

    int ans;
    int findCeil(Node root, int key) {
        ans = -1;
        solve(root, key);
        return ans;
    }
    
    void solve(Node root, int key){
        if(root.data == key){
            ans = root.data;
            return;
        }
        else if(root.data > key){
            ans = root.data;
            if(root.left != null) solve(root.left, key);
        }
        else{
            if(root.right != null) solve(root.right, key);
        }
    }
}
