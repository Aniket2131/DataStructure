import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

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
