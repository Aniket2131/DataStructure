import java.util.HashMap;

public class Q105 {
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

    HashMap<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i = 0; inorder.length > i; i++){
            map.put(inorder[i], i);
        }
        return solve(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode solve(int[] pre, int ps, int pe, int[] in, int is, int ie){
        if(ps > pe || is > ie) return null;

        TreeNode root = new TreeNode(pre[ps]);
        int inRoot = map.get(root.val);
        int left = inRoot - is;

        root.left = solve(pre,  ps+1,      ps + left, in,   is,         inRoot - 1);
        root.right = solve(pre, ps+left+1, pe,   in,   inRoot + 1, ie);

        return root;
    }
}
