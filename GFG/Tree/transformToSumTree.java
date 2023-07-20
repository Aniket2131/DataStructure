public class transformToSumTree{

    class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}

    public static void main(String[] args) {
        
    }

    public void toSumTree(Node root){
         //add code here.
         toSum(root);
    }
    
    public int toSum(Node root){
         //add code here.
         if(root == null) return 0;
         
         int left = toSum(root.left);
         int right = toSum(root.right);
         
         int n = root.data;
         
         root.data = left + right;
         
         return root.data + n;
    }
}