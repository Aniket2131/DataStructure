import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class NodeAtGivenDistance{
    public static void main(String[] args) {
        
    }

    class Node {
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
        }
    }

    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        HashMap<Node, Node> map = new HashMap<>();
        findParent(root, map);
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Node> vis = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if(root.data != target){
            root = getRoot(root, target);   
        }
        
        q.add(root);
        vis.add(root);
        int d = 0;
        while(!q.isEmpty()){
            if(d == k) break;
            d++;
            int s = q.size();
            for(int i = 0; s > i; i++){
                Node temp = q.poll();
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
        while(!q.isEmpty()) ans.add(q.poll().data);
        Collections.sort(ans);
        return ans; 
    }
    
    public static void findParent(Node root, HashMap<Node, Node> map){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.left != null){
                map.put(temp.left, temp);
                q.add(temp.left);
            }
            if(temp.right != null){
                map.put(temp.right, temp);
                q.add(temp.right);
            }
        }
    }
    
    public static Node getRoot(Node root, int target){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek().data == target) break;
            Node temp = q.poll();
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        return q.peek();
    }
}