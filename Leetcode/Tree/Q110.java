public class Q110 {
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

    public boolean isBalanced(TreeNode root) {
        return Balanced(root) == -1 ? false: true;
    }

    int Balanced(TreeNode root){
        if(root == null) return 0;

        int lh = Balanced(root.left);

        int rh = Balanced(root.right);

        if(lh == -1 || rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) return -1;

        return Math.max(lh, rh) + 1;
    }
}
