public class InsertionSortForSinglyLinkedList {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static void main(String[] args) {
        
    }

    public static Node insertionSort(Node head_ref)
    {
        //code here
        if(head_ref == null || head_ref.next == null) return head_ref;
        
        Node head = head_ref;
        Node tail = head;
        Node cur = tail.next;
        
        while(cur != null){
            
            if(cur.data >= tail.data){
                tail = cur;
                cur = cur.next;
                continue;
            }
            tail.next = cur.next;
            Node t1 = head;
            Node pre = null;
            
            while(t1 != tail.next){
                if(t1.data >= cur.data){
                    break;
                }
                else{
                    pre = t1;
                    t1 = t1.next;
                }
            }
            
            if(pre == null){
                cur.next = head;
                head = cur;
            }
            else {
                cur.next = pre.next;
                pre.next = cur;
            }
            cur = tail.next;
            
        }
        
        return head;
    }
}
