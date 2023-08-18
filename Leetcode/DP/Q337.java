public class Q337 {
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

    public static int rob(TreeNode root) {
        int[] choice = helper(root);
        return Math.max(choice[0], choice[1]);
    }

    public static int[] helper(TreeNode root){
        if(root == null){
            return new int[2];
        }

        int[] left_choice = helper(root.left);
        int[] right_choice = helper(root.right);
        int[] choice = new int[2];

        choice[0] = root.val + left_choice[1] + right_choice[1];

        choice[1] = Math.max(left_choice[0], left_choice[1]) + Math.max(right_choice[0], right_choice[1]);

        return choice;
    }
}
