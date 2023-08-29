public class Q2487 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        
    }

    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        int max = head.val;
        ListNode p = head;
        ListNode cur = head;
        head = head.next;
        while(head != null){
            if(head.val < max){
                p.next = head.next;
                head = p.next;
            }
            else{
                max = head.val;
                p = head;
                head = head.next;
            }
        }
        head = reverse(cur);
        return head;
    }

    ListNode reverse(ListNode head){
        ListNode p = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = p;
            p = head;
            head = temp;
        }
        return p;
    }
}
