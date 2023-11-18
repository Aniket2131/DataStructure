public class reverseADoubbly {
    public static void main(String[] args) {
        
    }

    class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public static Node reverseDLL(Node  head)
{
    //Your code here
    while(head.next != null){
        Node temp = head.next;
        head.next = head.prev;
        head.prev = temp;
        head = head.prev;
    }
    Node temp = head.next;
    head.next = head.prev;
    head.prev = temp;
    // head.next = head.prev;
    return head;
}
}
