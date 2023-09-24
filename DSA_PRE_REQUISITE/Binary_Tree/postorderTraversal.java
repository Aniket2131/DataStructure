public class postorderTraversal {
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

    ///////// itterative
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     Stack<TreeNode> s = new Stack<>();
    //     while(!s.isEmpty() || root != null){
    //         if(root != null){
    //             s.add(root);
    //             root = root.left;
    //         }
    //         else{
    //             TreeNode temp = s.peek().right;
    //             if(temp == null){
    //                 temp = s.pop();
    //                 ans.add(temp.val);
    //                 while(!s.isEmpty() && temp == s.peek().right){
    //                     temp = s.pop();
    //                     ans.add(temp.val);
    //                 }
    //             }
    //             else{
    //                 root = temp;
    //             }
    //         }
    //     }
    //     return ans;
    // } 

    ////// recursive
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     solve(root, ans);
    //     return ans;
    // }

    // public void solve(TreeNode root, List<Integer> ans) {
    //     if(root == null) return;
    //     solve(root.left, ans);
    //     solve(root.right, ans);
    //     ans.add(root.val);
    // }
}
