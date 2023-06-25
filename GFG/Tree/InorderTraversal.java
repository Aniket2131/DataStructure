import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {

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

    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        while (!st.isEmpty() || root != null) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            ans.add(root.data);
            root = root.right;

        }
        return ans;
    }
}
