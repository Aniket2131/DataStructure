import java.util.HashMap;

public class duplicateSubTreeInBinarytree{

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

    HashMap<String , Integer> map;
    int dupSub(Node root) {
        // code here 
        map = new HashMap<>();
        solve(root);
        
        for(String st: map.keySet()){
            if(map.get(st) >= 2) return 1;
        }
        return 0;
    }
    
    String solve(Node node){
        if(node == null) return "#";
        
        String s = "";
        if(node.left == null && node.right == null){
            s += node.data;
            return s;
        }
        
        s += node.data;
        
        s += solve(node.left);
        
        s += solve(node.right);
        
        map.put(s, map.getOrDefault(s, 0)+1);
        
        return s;
    }
}