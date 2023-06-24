public class countBSTNodesThatIieInAGivenRange {

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

    public static int getCount(Node root, int l, int h) {
        // Your code here
        if (root == null)
            return 0;

        int sum = 0;

        if (root.data > l)
            sum += getCount(root.left, l, h);

        if (root.data >= l && h >= root.data)
            sum += 1;

        if (h > root.data)
            sum += getCount(root.right, l, h);

        return sum;
    }
}