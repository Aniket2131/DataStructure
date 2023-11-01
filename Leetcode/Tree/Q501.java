import java.util.ArrayList;
import java.util.HashMap;

public class Q501{
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
    int max;
    public int[] findMode(TreeNode root) {
        map = new HashMap<>();
        max = 0;
        solve(root);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int el : map.keySet()){
            if(map.get(el) == max){
                arr.add(el);
            }
        }
        int[] ans = new int[arr.size()];
        int i = 0;
        for(int el : arr) ans[i++] = el;
        return ans;
    }

    public void solve(TreeNode root){
        if(root == null) return;
        int el = root.val;
        map.put(el, map.getOrDefault(el, 0) + 1);
        max = Math.max(max, map.get(el));
        solve(root.left);
        solve(root.right);
    }
}