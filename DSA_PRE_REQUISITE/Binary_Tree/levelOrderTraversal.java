import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
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

    public ArrayList<Integer> levelorder(Node node){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node temp = q.poll();
            ans.add(temp.data);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        return ans;
    }
}
