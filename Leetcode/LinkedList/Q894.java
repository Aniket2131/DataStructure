import java.util.ArrayList;
import java.util.List;

public class Q894 {
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

    public List<TreeNode> allPossibleFBT(int n) {
        if(n == 1){
            List<TreeNode> base = new ArrayList<>();
            base.add(new TreeNode(0));
            return base;
        }

        List<TreeNode> ans = new ArrayList<>();

        for(int i = 1; n > i; i+=2){
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i - 1);
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode temp = new TreeNode(0);
                    temp.left = l;
                    temp.right = r;
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
