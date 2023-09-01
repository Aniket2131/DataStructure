import java.util.LinkedList;
import java.util.Queue;

public class LeftmostAndRightmostNodesOfBinaryTree{

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

    public static void printCorner(Node node)
    {
        
        // add your code here    
        Queue<Node> q = new LinkedList<>();
        q.add(node);
    
        while(!q.isEmpty()){
            Queue<Node> t = new LinkedList<>();
            Node f = q.peek();
            Node l = f;
            while(!q.isEmpty()){
                Node temp = q.poll();
                l = temp;
                if(temp.left != null) t.add(temp.left);
                if(temp.right != null) t.add(temp.right);
            }
            q = t;
            System.out.print(f.data + " ");
            if(f != l){
                System.out.print(l.data + " ");
            }
        }
    }
}