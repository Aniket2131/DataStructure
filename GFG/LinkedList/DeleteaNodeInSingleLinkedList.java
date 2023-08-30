public class DeleteaNodeInSingleLinkedList{

    class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
    public static void main(String[] args) {
        
    }

    Node deleteNode(Node head, int x)
    {
	// Your code here
	    if(x == 1) return head.next;
	    Node cur = head.next;
	    Node pre = head;
	    int n = 2;
	    while(cur != null){
	        if(n == x){
	            pre.next = cur.next;
	            break;
	        }
	        n++;
	        pre = cur;
	        cur = cur.next;
	    }
	    return head;
    }
}
