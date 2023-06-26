import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class levelOrderTraversalInSpiralForm {

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

    ArrayList<Integer> findSpiral(Node root) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if (root == null)
            return ans;
        q.add(root);
        Boolean flag = true;
        while (!q.isEmpty()) {
            int size = q.size();
            Stack<Node> st = new Stack<>();
            for (int i = 0; size > i; i++) {
                Node temp = q.poll();

                if (flag) {
                    ans.add(temp.data);
                } else {
                    st.push(temp);
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            flag = !flag;
            while (!st.isEmpty()) {
                ans.add(st.pop().data);
            }
        }
        return ans;
    }
}
