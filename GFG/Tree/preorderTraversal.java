import java.util.ArrayList;
import java.util.Stack;

public class preorderTraversal {

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

    public static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node cur = st.peek();
            ans.add(cur.data);
            st.pop();
            if (cur.right != null) {
                st.push(cur.right);
            }
            if (cur.left != null) {
                st.add(cur.left);
            }
        }
        return ans;
    }
}