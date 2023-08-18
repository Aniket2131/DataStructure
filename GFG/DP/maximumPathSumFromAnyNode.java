public class maximumPathSumFromAnyNode {

    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        
    }

    int ans;
    int findMaxSum(Node node)
    {
        //your code goes here
        ans = Integer.MIN_VALUE;
        helper(node);
        return ans;
    }
    
    public int helper(Node root){
        if(root == null) return 0;

        int l = helper(root.left);
        int r = helper(root.right);

        int a = root.data + l + r;

        int b = root.data;

        int c = root.data + Math.max(l, r);

        ans = Math.max(ans, Math.max(a, Math.max(b, c)));

        return Math.max(b, c);
    }
}
