public class checkForBalancedTree {
    public static void main(String[] args) {
        
    }

    class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
boolean isBalanced(Node root)
    {
	// Your code here
	    
	    return balanced(root) == -1 ? false : true; 
    }
    
    int balanced(Node root){
        if(root == null) return 0;
        
        int lh = balanced(root.left);
        
        int rh = balanced(root.right);
        
        if(lh == -1 || rh == -1) return -1;
        
        if(Math.abs(lh - rh) > 1) return -1;
        
        return Math.max(lh, rh) + 1;
    }
}
