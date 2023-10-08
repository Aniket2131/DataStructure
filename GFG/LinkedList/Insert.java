public class Insert {
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

    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node temp = new Node(key);
        if(head1.data >= key){
            temp.next = head1;
            return temp; 
        }
        Node temp1 = head1;
        while(temp1.next != null){
            if(temp1.data < key && temp1.next.data >= key){
                temp.next = temp1.next;
                temp1.next = temp;
                return head1;
            }
            temp1 = temp1.next;
        }
        temp1.next = temp;
        return head1; 
    }
}
