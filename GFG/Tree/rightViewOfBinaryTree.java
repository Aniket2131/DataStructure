import java.util.ArrayList;

public class rightViewOfBinaryTree {
    public static void main(String[] args) {
        
    }
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ans = new ArrayList<>();
        view(node, ans, 0);
        return ans;
    }
    
    void view(Node root, ArrayList<Integer> ans, int level){
        if(root == null) return;
        
        if(ans.size() == level) ans.add(root.data);
        
        view(root.right, ans, level + 1);
        
        view(root.left, ans, level + 1);
    }

    class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}
}
