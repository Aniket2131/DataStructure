import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q2385 {
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

    public void makeParent(TreeNode root, HashMap<TreeNode, TreeNode> map){
        if(root == null) return;
        
        TreeNode l = root.left, r = root.right;

        map.put(l, root);
        map.put(r, root);

        makeParent(root.left, map);
        makeParent(root.right, map); 
    }

    public TreeNode reachTrg(TreeNode root, int start){
        if(root == null) return null;

        if(root.val == start) return root;

        TreeNode l = reachTrg(root.left, start);
        if(l != null) return l;
        TreeNode r = reachTrg(root.right, start);
        return r;
    }

    class Pair{
        TreeNode node;
        int num;

        Pair(TreeNode node, int num){
            this.node = node;
            this.num = num;
        }
    }

    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        
        makeParent(root, parent);

        root = reachTrg(root, start);
        Set<TreeNode> s = new HashSet<>();

        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        s.add(root);

        while(!q.isEmpty()){

            Pair temp = q.poll();
            TreeNode node = temp.node;
            int dis = temp.num;

            ans = Math.max(ans, dis);

            if(node.left != null && !s.contains(node.left)){
                q.add(new Pair(node.left, dis+1));
                s.add(node.left);
            }

            if(node.right != null && !s.contains(node.right)){
                q.add(new Pair(node.right, dis+1));
                s.add(node.right);
            }

            if(parent.containsKey(node) && !s.contains(parent.get(node))){
                q.add(new Pair(parent.get(node), dis+1));
                s.add(parent.get(node));
            }
        }

        return ans;
    }
}
