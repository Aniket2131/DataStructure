import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q863 {
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

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        storeParent(root, map);
        List<Integer> ans = new ArrayList<>();
        ArrayList<TreeNode> vis = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);  
        vis.add(target);
        int d = 0;
        while(!q.isEmpty()){
            int s = q.size();
            if(d == k) break;
            d++;
            for(int i = 0; s > i; i++){
                TreeNode temp = q.poll();
                if(temp.left != null && !vis.contains(temp.left)){
                    q.add(temp.left);
                    vis.add(temp.left);
                }

                if(temp.right != null && !vis.contains(temp.right)){
                    q.add(temp.right);
                    vis.add(temp.right);
                }

                if(map.containsKey(temp) && !vis.contains(map.get(temp))){
                    q.add(map.get(temp));
                    vis.add(map.get(temp));
                }
            }
        }

        while(!q.isEmpty()) ans.add(q.poll().val);
        return ans;
    }

    public void storeParent(TreeNode root, HashMap<TreeNode, TreeNode> map){
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            TreeNode temp = qu.poll();
            if(temp.left != null){
                qu.add(temp.left);
                map.put(temp.left, temp);
            }
            if(temp.right != null){
                qu.add(temp.right);
                map.put(temp.right, temp);
            }
        }
    }
}
