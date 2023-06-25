import java.util.ArrayList;
import java.util.Stack;

public class postorderTraversal {
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

    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        while (!st.isEmpty() || root != null) {
            if (root != null) {
                st.push(root);
                root = root.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    ans.add(st.pop().data);

                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        ans.add(temp.data);
                    }
                } else {
                    root = temp;
                }

            }
        }
        return ans;
    }
}
