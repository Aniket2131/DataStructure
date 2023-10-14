import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q103{
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> ans = new ArrayList<>();
	    Queue<TreeNode> q = new LinkedList<>();
			if(root == null) return ans;
	    q.add(root);
	    boolean rev = false;
	    while(!q.isEmpty()){
	        int s = q.size();
            List<Integer> il = new ArrayList<>();
	        for(int i = 0; s > i; i++){
	            TreeNode temp = q.poll();
							if(temp != null){
								if(rev){
	                il.add(il.size()-i,temp.val);
	            	}
	            	else{
	                il.add(temp.val);
	            	}
	            	if(temp.left != null) q.add(temp.left);
	            	if(temp.right != null) q.add(temp.right);
							}
	        }
            ans.add(il);
	        rev = !rev;
	    }
	    return ans;
    }
}