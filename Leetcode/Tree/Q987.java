import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class  Q987{
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

    class Tuple{
        TreeNode node;
        int lev;
        int pos;
        Tuple(TreeNode node, int pos, int lev){
            this.node = node;
            this.lev = lev;
            this.pos = pos;
        }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple temp = q.poll();
            int p = temp.pos;
            int l = temp.lev;
            if(!map.containsKey(p)){
                map.put(p, new TreeMap<>());
            }
            if(!map.get(p).containsKey(l)){
                map.get(p).put(l, new PriorityQueue<>());
            }
            map.get(p).get(l).offer(temp.node.val);

            if(temp.node.left != null){
                q.offer(new Tuple(temp.node.left, p-1, l+1));
            }
            if(temp.node.right != null){
                q.offer(new Tuple(temp.node.right, p+1, l+1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> el: map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq: el.values()){
                while(!pq.isEmpty()){
                    ans.get(ans.size()-1).add(pq.poll());
                }
            }
        }
        return ans;
    }
}