import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class verticalOrderTraversal {
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

    static class Tuple{
        Node node;
        int lev;
        int pos;
        Tuple(Node node, int pos, int lev){
            this.node = node;
            this.lev = lev;
            this.pos = pos;
        }
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();
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
                map.get(p).put(l, new ArrayList<>());
            }
            map.get(p).get(l).add(temp.node.data);

            if(temp.node.left != null){
                q.offer(new Tuple(temp.node.left, p-1, l+1));
            }
            if(temp.node.right != null){
                q.offer(new Tuple(temp.node.right, p+1, l+1));
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(TreeMap<Integer, ArrayList<Integer>> el: map.values()){
            for(ArrayList<Integer> arr: el.values()){
                for(int i = 0; arr.size() > i; i++){
                    ans.add(arr.get(i));
                }
            }
        }
        return ans;
    }
}
