public class countLeavesInBinaryTree {

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

    int countLeaves(Node node) {
        // Your code
        if (node.left == null && node.right == null)
            return 1;

        int ans = 0;

        if (node.left != null) {
            ans += countLeaves(node.left);
        }
        if (node.right != null) {
            ans += countLeaves(node.right);
        }

        return ans;
    }
}
