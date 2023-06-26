import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KDistanceFromRoot {
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

    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        if (k == 0) {
            ans.add(root.data);
            return ans;
        }
        int j = 1;
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; s > i; i++) {
                Node temp = q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                    if (j == k)
                        ans.add(temp.left.data);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                    if (j == k)
                        ans.add(temp.right.data);
                }
            }
            if (j == k)
                break;
            j++;
        }
        return ans;
    }

}
