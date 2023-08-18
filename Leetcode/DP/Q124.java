public class Q124 {

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

    public static int ans;

    public static int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }

    public static int helper(TreeNode root){
        if(root == null) return 0;

        int l = helper(root.left);
        int r = helper(root.right);

        int a = root.val + l + r; //nichay he ans mil gaya 

        int b = root.val; // root acha h

        int c = root.val + Math.max(l, r); // dono me se ek acha h 

        ans = Math.max(ans, Math.max(a, Math.max(b, c)));

        return Math.max(b, c);
    }
}
