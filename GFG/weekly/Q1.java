// Mean BST

import java.util.TreeSet;

public class Q1 {

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static void main(String[] args) {
        Integer a = 8;
        Integer b = 3;
        // float c = b/2;
        // System.out.println(c);
        System.out.println(Math.ceil(((double)a + (double)b)/2));
    }

    TreeSet<Integer> set;
    int mean(Node root, int key){
        // code here
        set = new TreeSet<Integer>();
        helper(root);
        
        Integer a = set.ceiling(key);
        Integer b = set.floor(key);
        if(a == null && b != null) return (int) (Math.ceil(b/2));
        
        if(b == null && a != null) return (int) (Math.ceil(a/2));
        
        if(a == null && b == null) return -1;
        
        return (int) (Math.ceil(((double)a + (double)b)/2));
    }
    
    void helper(Node root){
        if(root == null) return;
        
        set.add(root.data);
        
        helper(root.left);
        
        helper(root.right);
    }
}
