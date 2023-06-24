public class Q938 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;

        int sum = 0;

        if (root.val > low)
            sum += rangeSumBST(root.left, low, high);

        if (root.val >= low && high >= root.val)
            sum += root.val;

        if (high > root.val)
            sum += rangeSumBST(root.right, low, high);

        return sum;
    }
}