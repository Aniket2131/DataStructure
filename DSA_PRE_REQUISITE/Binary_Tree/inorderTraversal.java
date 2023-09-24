public class inorderTraversal {

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

///////////////   itterative
// public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         if(root == null) return ans;
//         Stack<TreeNode> s = new Stack<>();
//         TreeNode cur = root; 
//         // s.push(cur);
//         while(!s.isEmpty() || cur != null){
//             if(cur != null){
//                 s.push(cur);
//                 cur = cur.left;
//             }
//             else{
//                  cur = s.pop();
//                  ans.add(cur.val);
//                  cur = cur.right;
//              }    
//         }
//         return ans;
//     }


    ///////////// recursive method
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     solve(root, ans);
    //     return ans;
    // }
    // public void solve(TreeNode root, List<Integer> ans) {
    //     if (root == null)
    //         return;

    //     solve(root.left, ans);
    //     ans.add(root.val);
    //     solve(root.right, ans);
    // }
}