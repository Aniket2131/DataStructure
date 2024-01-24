import java.util.HashMap;

public class Q1457 {
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

    public boolean check(){
        int odd = 0;
        for(int el : map.keySet()){
            int n = map.get(el);

            if(n % 2 != 0) odd++;
        }
        return odd <= 1;
    } 
    public int solve(TreeNode root){
        if(root == null) return 0;

        if(root.left == null && root.right == null){
            if(check()) return 1;
            return 0;
        }
        int a = 0;
        if(root.left != null){
            map.put(root.left.val, map.getOrDefault(root.left.val, 0)+1);
            a = solve(root.left);
            int n = map.get(root.left.val);
            if(n > 1){
                map.put(root.left.val, n - 1);
            }
            else{
                map.remove(root.left.val);
            }
        }
        int b = 0;
        if(root.right != null){
            map.put(root.right.val, map.getOrDefault(root.right.val, 0)+1);
            b = solve(root.right);
            int n = map.get(root.right.val);
            if(n > 1){
                map.put(root.right.val, n - 1);
            }
            else{
                map.remove(root.right.val);
            }
        }
        
        return a + b;
    }

    public int pseudoPalindromicPaths (TreeNode root) {
        map = new HashMap<>();
        map.put(root.val, 1);
        return solve(root);
    }
}
