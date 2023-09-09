import java.util.ArrayList;

public class KthLargestElementinBST {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

    }

    ArrayList<Integer> arr;

    public int kthLargest(Node root, int K) {
        // Your code here
        arr = new ArrayList<>();
        solve(root);
        return arr.get(arr.size() - K);
    }

    public void solve(Node root) {
        if (root == null)
            return;

        solve(root.left);
        arr.add(root.data);
        solve(root.right);
    }
}