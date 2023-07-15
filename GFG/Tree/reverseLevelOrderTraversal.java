import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseLevelOrderTraversal{

    class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> s = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        s.push(node);
        while(!q.isEmpty()){
            int si = q.size();
            for(int i = 0; si > i; i++){
                Node temp = q.poll();
                if(temp.right != null){
                    q.add(temp.right);
                    s.push(temp.right);
                }
                if(temp.left != null){
                    q.add(temp.left);
                    s.push(temp.left);
                }
            }
        }
        while(!s.isEmpty()){
            ans.add(s.pop().data);
        }
        return ans;
    }
}