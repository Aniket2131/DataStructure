public class ReverseaLinkedListingroupsofgivensize{
    class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
    public static void main(String[] args) {
        
    }

    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node pre = null;
        Node cur = node;
        Node nex = null;
        int c = 0;
        while(cur != null && k > c){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
            c++;
        }
        if(nex != null){
            node.next = reverse(nex, k);
        }
        
        return pre;  
    }
}