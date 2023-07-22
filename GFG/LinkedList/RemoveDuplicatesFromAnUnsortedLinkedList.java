import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnUnsortedLinkedList {
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

    public Node removeDuplicates(Node head) 
    {
         // Your code here
         Set<Integer> set = new HashSet<>();
         Node temp = head;
         set.add(head.data);
         while(temp != null && temp.next != null){
             if(set.contains(temp.next.data)){
                 temp.next = temp.next.next;
             }
             else{
                 set.add(temp.next.data);
                 temp = temp.next;
             }
         }
         return head;
    }

}
