public class reverseInKGroup {
    public static void main(String[] args) {
        
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead, pre = newHead, nex = newHead;
        int cnt = 0;
        while(cur.next != null){
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
        return newHead.next;
    }
}
