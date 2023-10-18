import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
public class bottom {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        
    }

    static class Pair{
        Node node;
        int ver;
        Pair(Node node, int ver){
            this.node = node;
            this.ver = ver;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            Node node = temp.node;
            int ver = temp.ver;
            
            if(!map.containsKey(ver)){
                map.put(ver, new ArrayList<>());
            }
            
            map.get(ver).add(node.data);
            
            if(node.left != null){
                q.offer(new Pair(node.left, ver-1));
            }
            if(node.right != null){
                q.offer(new Pair(node.right, ver+1));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(ArrayList<Integer> el : map.values()){
            ans.add(el.get(el.size()-1));
        }
        return ans;
    }
}
