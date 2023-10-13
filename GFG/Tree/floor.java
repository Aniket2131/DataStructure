public class floor{
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
    public static int floor(Node root, int x) {
        int an = -1;
        while(root != null){
            if(root.data == x) return x;
            if(root.data < x){
                an = Math.max(an, root.data);
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return an;
    }
}