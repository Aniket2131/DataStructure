public class Q234 {
    public static void main(String[] args) {
        Q234 ll = new Q234();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(2);
        ll.insertFirst(1);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode s = head;
        ListNode f = head;
        ListNode p = null;
        while (f != null && f.next != null) {
            f = f.next.next;

            ListNode snext = s.next;
            s.next = p;
            p = s;
            s = snext;
        }

        if (f != null)
            s = s.next;

        while (p != null && s != null) {
            if (p.val != s.val) {
                return false;
            }
            s = s.next;
            p = p.next;
        }
        return true;
    }

    // prerequistic for running linked list in vs code

    private static ListNode head;

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

    public void insertFirst(int val) {

        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    public void Display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }
}