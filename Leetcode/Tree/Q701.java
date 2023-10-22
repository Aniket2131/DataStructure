public class Q701 {
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = new TreeNode(val);
        if(root == null) return temp;
        TreeNode cur = root;
        TreeNode pre = null;
        while(cur != null){
            if(cur.val > val){
                pre = cur;
                cur = cur.left;
            }
            else{
                pre = cur;
                cur = cur.right;
            }
        }
        if(pre.val > val) pre.left = temp;
        else pre.right = temp;

        return root;
    }
}
