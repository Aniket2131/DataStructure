public class Q1022 {
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

    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    private int sumRootToLeaf(TreeNode root, int sum) {
        if (root == null)
            return 0;

        sum = (sum << 1) + root.val;

        if (root.left == null && root.right == null)
            return sum;

        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
    }
}