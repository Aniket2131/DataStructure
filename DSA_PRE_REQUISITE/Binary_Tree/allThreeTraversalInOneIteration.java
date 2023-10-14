import java.util.ArrayList;
import java.util.Stack;

public class allThreeTraversalInOneIteration {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class pair{
        Node node;
        int num;
        pair(Node node, int num){
            this.node = node;
            this.num = num;
        }
    }

    public static void main(String[] args) {
        
    }

    public void pip(Node head){
        Stack<pair> s = new Stack<>();
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        s.push(new pair(head, 1));
        while(!s.isEmpty()){
            pair temp = s.pop();
            int n = temp.num;
            Node tempNode = temp.node;
            if(n == 1){
                pre.add(tempNode.data);
                s.push(new pair(tempNode, n++));
                if(tempNode.left != null){
                    s.push(new pair(tempNode.left, 1));
                }
            }
            else if(n == 2){
                in.add(tempNode.data);
                s.push(new pair(tempNode, n++));
                if(tempNode.right != null){
                    s.push(new pair(tempNode.left, 1));
                }
            }
            else{
                pos.add(tempNode.data);
            }
        }
    }

}
