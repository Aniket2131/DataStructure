import java.util.HashMap;

public class kSumPath {
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

    int ttl, ans;
    public int sumK(Node root,int k)
    {
        // code here 
        ans = 0;
        ttl = k;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        solve(root, 0, map);
        return ans;
    }
    
    public void solve(Node root, int sum, HashMap<Integer, Integer> map){
        if(root == null){
            return;
        }
        sum += root.data;
        
        int el = sum - ttl;
        if(map.containsKey(el)){
            ans += map.get(el);
        }
        map.put(sum, map.getOrDefault(sum, 0)+1);
        solve(root.left, sum, map);
        solve(root.right, sum, map);
        map.put(sum, map.get(sum)-1);
    }
}
