import java.util.ArrayList;
import java.util.HashMap;

public class findCommonNodeInTwoBST{
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

    public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        HashMap<Integer, Integer> map = new HashMap<>();
        store(root1, map);
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root2, ans, map);
        return ans;
    }
    
    public static void solve(Node root, ArrayList<Integer> ans, HashMap<Integer, Integer> map){
        if(root == null) return;
        
        solve(root.left, ans, map);
        if(map.containsKey(root.data)){
            ans.add(root.data);
        }
        solve(root.right, ans, map);
    } 
    
    public static void store(Node root, HashMap<Integer, Integer> map){
        if(root == null) return;
        
        map.put(root.data, 1);
        store(root.left, map);
        store(root.right, map);
    }
}