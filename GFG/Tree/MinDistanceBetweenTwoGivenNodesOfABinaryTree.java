import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinDistanceBetweenTwoGivenNodesOfABinaryTree{
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

    HashMap<Node, Node> par;
    
    class pair{
        Node node;
        int dis;
        
        pair(Node node, int dis){
            this.node = node;
            this.dis = dis;
        }
    }
    
    void setPar(Node root, Node p){
        if(root == null) return;
        
        par.put(root, p);
        
        setPar(root.left, root);
        
        setPar(root.right, root);
    }
    
    Node reachNum(Node root, int a){
        if(root == null) return null;
        
        if(root.data  == a) return root;
        
        Node left = reachNum(root.left, a);
        if(left.data == a) return left;
        
        Node right = reachNum(root.right, a);
        return right;
    }
    int findDist(Node root, int a, int b) {
        // Your code here
        par = new HashMap<>();
        setPar(root, new Node(-1));
        
        Queue<pair> q = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        root = reachNum(root, a);
        q.add(new pair(root, 0));
        s.add(root.data);
        
        while(!q.isEmpty()){
            pair temp = q.poll();
            Node num = temp.node;
            int d = temp.dis;
            if(num.data == b) return d;
            
            if(num.left != null && !s.contains(num.left.data)){
                q.add(new pair(num.left, d+1));
                s.add(num.left.data);
            }
            
            if(num.right != null && !s.contains(num.right.data)){
                q.add(new pair(num.right, d+1));
                s.add(num.right.data);
            }
            
            if(par.containsKey(num) && !s.contains(par.get(num).data)){
                q.add(new pair(par.get(num), d+1));
                s.add(par.get(num).data);
            }
            
        }
        return -1;
    }
}