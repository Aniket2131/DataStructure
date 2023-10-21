import java.util.LinkedList;
import java.util.Queue;

public class Q662{
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

    class Pair{
        int num;
        TreeNode node;
        Pair(int num, TreeNode node){
            this.num = num;
            this.node = node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        int ans = 0;
        q.offer(new Pair(0, root));
        while(!q.isEmpty()){
            int s = q.size();
            int f = 0, l = 0, min = q.peek().num;
            for(int i = 0; s > i; i++){
                Pair temp = q.poll();
                int n = temp.num;
                TreeNode temp1 = temp.node;
                if(i == 0) f = n-min;
                if(i == s-1) l = n-min;
                if(temp1.left != null){
                    q.offer(new Pair(2*(n-min) + 1, temp1.left));
                }
                if(temp1.right != null){
                    q.offer(new Pair(2*(n-min) + 2, temp1.right));;
                }
            }
            ans = Math.max(ans, l-f+1);
        }
        return ans;
    }
}