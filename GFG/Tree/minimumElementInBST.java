public class minimumElementInBST {
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

    int minValue(Node node) {
        while (node != null) {
            if (node.left == null) {
                return node.data;
            } else {
                node = node.left;
            }
        }
        return -1;
    }
}
