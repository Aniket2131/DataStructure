public class Q2{
    public class ListNode {
            int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public static void main(String[] args) {
        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        Boolean rem = false;
        while(l1 != null || l2 != null){
            int n1 = 0, n2 = 0;
            if(l1 != null) n1 = l1.val;

            if(l2 != null) n2 = l2.val;

            int n = n1 + n2;
            if(rem) n++;

            if(n / 10 == 0) rem = false;
            else{
                rem = true;
            }
            ListNode temp2 = new ListNode(n % 10);
            temp.next = temp2;
            temp = temp.next;
            if(l1 != null) l1 = l1.next;

            if(l2 != null) l2 = l2.next;
        }
        if(rem){
            ListNode temp2 = new ListNode(1);
            temp.next = temp2;
            temp = temp.next;
        } 
        return head.next;
    }
}