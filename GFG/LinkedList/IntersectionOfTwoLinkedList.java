public class IntersectionOfTwoLinkedList {
    static class Node
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

    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node head = null;
        Node newHead = null;
        while(head1 != null && head2 != null){
            if(head1.data == head2.data){
                Node temp = new Node(head1.data);
                if(head == null){
                    head = temp;
                    newHead = temp;
                }
                else{
                    head.next = temp;
                    head = head.next;
                }
                
                head1 = head1.next;
                head2 = head2.next;
            }
            else if(head1.data > head2.data){
                head2 = head2.next;
            }
            else{
                head1 = head1.next;
            }
        }
        return newHead;
    }
}
