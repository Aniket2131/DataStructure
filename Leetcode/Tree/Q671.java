import java.util.PriorityQueue;

public class Q671{

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

    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        find(root, pq);
        int num = pq.poll();
        while(pq.size() > 0 && num >= pq.peek()) num = pq.poll();

        return pq.size() == 0? -1: pq.poll();
    }
    public void find(TreeNode root, PriorityQueue<Integer> pq){
        if(root == null) return;
        
        pq.add(root.val);

        find(root.left, pq);

        find(root.right, pq);
    }
}