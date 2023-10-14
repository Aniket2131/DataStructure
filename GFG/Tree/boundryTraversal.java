import java.util.ArrayList;
import java.util.Stack;

public class boundryTraversal{

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

    boolean isLeaf(Node root){
        return (root.left == null)&&(root.right == null);
    }
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(!isLeaf(node)) ans.add(node.data);
	    leftBoundry(node, ans);
	    inorder(node, ans);
	    rightBoundry(node, ans);
	    return ans;
	}
	
	void leftBoundry(Node node, ArrayList<Integer> ans){
	    Node cur = node.left;
	    while(cur != null){
	        if(!isLeaf(cur)) ans.add(cur.data);
	        if(cur.left != null){
	            cur = cur.left;
	        }
	        else{
	            cur = cur.right;
	        }
	    }
	}
	
	void rightBoundry(Node node, ArrayList<Integer> ans){
	    Node cur = node.right;
	    Stack<Integer> st = new Stack<>(); 
	    while(cur != null){
	        if(!isLeaf(cur)) st.push(cur.data);
	        if(cur.right != null){
	            cur = cur.right;
	        }
	        else{
	            cur = cur.left;
	        }
	    }
	    
	    while(!st.isEmpty()){
	        int temp = st.pop();
	        ans.add(temp);
	    }
	}
	
	void inorder(Node node, ArrayList<Integer> ans){
	    if(isLeaf(node)){
	        ans.add(node.data);
	        return;
	    }
	    if(node.left != null) inorder(node.left, ans);
	    if(node.right != null) inorder(node.right, ans);
	}
}