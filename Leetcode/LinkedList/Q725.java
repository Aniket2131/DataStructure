public class Q725{
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int key) {
            this.val = key;
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        int rem = size % k;
        int each = size / k;
        cur = head;
        int i = 0, cnt = 0;
        ListNode pre = null;
        while(cur != null){
            ans[i] = cur;
            System.out.println(i);
            while(cur != null && cnt != each){
                cnt++;
                pre = cur;
                cur = cur.next;
            }
            if(rem > 0){
                pre = cur;
                cur = cur.next;
                rem--;
            }
            pre.next = null;
            i++;
            cnt = 0;
        }
        return ans; 
    }
}