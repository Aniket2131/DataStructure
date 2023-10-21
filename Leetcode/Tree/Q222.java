public class Q222 {
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

    public int countNodes(TreeNode root) {
        int lh = solve(root, false);
        int rh = solve(root, true);

        if(lh == rh){
            return (int)Math.pow(2.0, (lh * 1.0)) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int solve(TreeNode root, boolean f){
        if(root == null) return 0;

        if(f){
            return 1 + solve(root.right, f);
        }
        return 1 + solve(root.left, f);
    }
}
