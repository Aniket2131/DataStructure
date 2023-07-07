import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class diagonalSumInBinaryTree{
    public static void main(String[] args) {
        
    }

    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            int sum = 0;
            for(int i = 0; s > i; i++){
                Node temp = q.poll();
                while(temp != null){
                    if(temp.left != null) q.add(temp.left);
                    sum += temp.data;
                    temp = temp.right;
                }
            }
            ans.add(sum);
        }
        return ans;
    }

    class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
}