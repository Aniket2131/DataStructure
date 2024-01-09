import java.util.ArrayList;

public class Q872{

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        solve(root1, arr1);
        solve(root2, arr2);

        if(arr1.size() != arr2.size()) return false;
        int n = arr1.size();
        for(int i = 0; n > i; i++){
            if(arr1.get(i) != arr2.get(i)){
                return false;
            }
        }
        return true;
    }

    public void solve(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;

        if(root.left == null && root.right == null){
            arr.add(root.val);
            return;
        }

        solve(root.left, arr);
        solve(root.right, arr);

    }                
}