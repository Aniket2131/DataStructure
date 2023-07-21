public class Q25{
    // private static ListNode head;

    private class ListNode {
        // int val;
        ListNode next;

        ListNode() {
        }
    }
    public static void main(String[] args) {
        
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next == null) return head;

        ListNode dumy = new ListNode();
        dumy.next = head;
        ListNode pre = dumy;
        ListNode cur = dumy;
        ListNode nex = dumy;
        int cnt = 0;
        while(cur.next != null) {
            cur = cur.next;
            cnt++;
        }

        while(cnt >= k){
            cur = pre.next;
            nex = cur.next;
            for(int i = 1; k > i; i++){ 
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            cnt -= k;
        }
        return dumy.next;
    }
}