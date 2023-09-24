

public class preorderTraversal {

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
    public static void main(String[] args) {
        
    }

    //////// Itterative
    //     public List<Integer> preorderTraversal(TreeNode root) {
    //         List<Integer> ans = new ArrayList<>();
    //         Stack<TreeNode> s = new Stack<>();
    //         s.push(root);
    //         while(!s.isEmpty()){
    //             root = s.pop();
    //             ans.add(root.val);
    //             if(root.right != null){
    //                 s.push(root.right);
    //             }
    //             if(root.left != null){
    //                 s.push(root.left);
    //             }
    //         }
    //         return ans;
    // }



    /////////// recursive
    //  public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     solve(root, ans);
    //     return ans;
    // }

    // public void solve(TreeNode root, List<Integer> ans) {
    //     if(root == null) return;

    //     ans.add(root.val);
    //     solve(root.left, ans);
    //     solve(root.right, ans);
    // }
}
