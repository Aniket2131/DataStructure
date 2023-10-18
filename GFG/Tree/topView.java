import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class topView{
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
        int ver;
        Tuple(Node node, int lev, int ver){
            this.node = node;
            this.lev = lev;
            this.ver = ver;
        }
    }
    static ArrayList<Integer> topVie(Node root)
    {
        // add your code
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple temp = q.poll();
            Node node = temp.node;
            int ver = temp.ver;
            int lev = temp.lev;
            
            if(!map.containsKey(ver)){
                map.put(ver, new TreeMap<>());
            }
            
            if(!map.get(ver).containsKey(lev)){
                map.get(ver).put(lev, new ArrayList<>());
            }
            
            map.get(ver).get(lev).add(node.data);
            
            if(node.left != null){
                q.offer(new Tuple(node.left, lev+1, ver-1));
            }
            if(node.right != null){
                q.offer(new Tuple(node.right, lev+1, ver+1));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(TreeMap<Integer, ArrayList<Integer>> el : map.values()){
            for(ArrayList<Integer> arr : el.values()){
                for(int ele: arr){
                    ans.add(ele);
                    break;
                }
                break;
            }
        }
        return ans;
    }
}