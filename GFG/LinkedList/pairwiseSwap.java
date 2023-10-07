public class pairwiseSwap{

    class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

    public static void main(String[] args) {
        
    }

    public Node pairwiseSwa(Node head)
    {
        // code here
        Node cur = head;
        Node pre = null;
        Node nex = null;
        int cnt = 2;
        while(cur != null && cnt > 0){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
            cnt--;
        }
        
        if(nex != null){
            head.next = pairwiseSwa(nex);
        }
        else{
            head.next = nex;
        }
        return pre;
    }
}