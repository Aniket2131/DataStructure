
public class sumOfBinaryTree {
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

    static int sumBT(Node head){
        //Code
        if(head == null) return 0;
        
        int sum = head.data;
        if(head.left == null && head.right == null) return sum;
        
        
        sum += sumBT(head.left);
        
        sum += sumBT(head.right);
        
        return sum;
    }
}
