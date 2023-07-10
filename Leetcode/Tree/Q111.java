import java.util.LinkedList;
import java.util.Queue;

public class Q111{
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

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = 0;
        while(!q.isEmpty()){
            int s = q.size();
            ans++;
            for(int i = 0; s > i; i++){
                TreeNode temp = q.poll();
                Boolean flag = true;
                if(temp.left != null){
                    q.add(temp.left);
                    flag = false;
                }
                if(temp.right != null){
                    q.add(temp.right);
                    flag = false;
                }
                if(flag) return ans;

            }
        }
        return ans;
    }
}