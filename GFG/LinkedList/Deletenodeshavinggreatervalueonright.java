public class Deletenodeshavinggreatervalueonright {

    class Node {
        int data;
        Node next;
     
       Node(int data) {
           this.data = data;
       }
     }
    public static void main(String[] args) {
        
    }

    Node compute(Node head)
    {
        // your code here
        head = reverse(head);
        int max = head.data;
        Node p = head;
        Node cur = head;
        head = head.next;
        while(head != null){
            if(head.data < max){
                p.next = head.next;
                head = p.next;
            }
            else{
                max = head.data;
                p = head;
                head = head.next;
            }
        }
        head = reverse(cur);
        return head;
    }
    
    Node reverse(Node head){
        Node p = null;
        while(head != null){
            Node temp = head.next;
            head.next = p;
            p = head;
            head = temp;
        }
        return p;
    }
}
