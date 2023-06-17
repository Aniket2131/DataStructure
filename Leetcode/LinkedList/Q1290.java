public class Q1290 {
    public static void main(String[] args) {
        Q1290 ll = new Q1290();
        ll.insertFirst(1);
        ll.insertFirst(0);
        ll.insertFirst(1);
        // ll.Display();
        System.out.println(getDecimalValue(head));
    }

    public static int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
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