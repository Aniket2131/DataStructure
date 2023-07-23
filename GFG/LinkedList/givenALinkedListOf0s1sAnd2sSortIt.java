public class givenALinkedListOf0s1sAnd2sSortIt {
    class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

static Node segregate(Node head)
    {
        // add your code here
        int z = 0, o = 0, t = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0) z++;
            else if(temp.data == 1) o++;
            else t++;
            temp = temp.next;
        }
        
        int i = 0;
        temp = head;
        for(; z > i; i++){
            temp.data = 0;
            temp = temp.next;
        }
        for(; z + o > i; i++){
            temp.data = 1;
            temp = temp.next;
        }
        for(; z + o + t > i; i++){
            temp.data = 2;
            temp = temp.next;
        }
        return head;
    }
}
