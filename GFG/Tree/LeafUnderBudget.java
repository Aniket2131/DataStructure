import java.util.PriorityQueue;

public class LeafUnderBudget{

    class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
    public static void main(String[] args) {
        
    }

    public int getCount(Node node, int bud)
    {
        //code here  
        PriorityQueue<Integer> q = new PriorityQueue<>();
        solve(node, q, 1);
        int ans = 0;
        while(bud > 0 && q.size() > 0){
            int temp = q.poll();
            if(temp <= bud){
                ans++;
                bud -= temp;
            }
            else{
                break;
            }
        }
        return ans;
    }
    
    public void solve(Node node, PriorityQueue<Integer> q, int lev){
        if(node == null) return;
        
        if(node.left == null && node.right == null) q.add(lev);
        
        solve(node.left, q, lev+1);
        solve(node.right, q, lev+1);
    }
}
