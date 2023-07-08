public class Q404{
    public static void main(String[] args) {
        
    }
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, false);
    }

    public int sum(TreeNode root, Boolean flag){
        int ans = 0;
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            if(flag){
                ans += root.val;       
            }
            return ans;
        }
        ans += sum(root.left, true);

        ans += sum(root.right, false);

        return ans;
    } 
}