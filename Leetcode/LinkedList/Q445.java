import java.util.Stack;

public class Q445{
    // private static ListNode head;

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int key) {
            this.val = key;
        }
    }
    public static void main(String[] args) {
        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        add(s1, l1);
        add(s2, l2);
        ListNode ans = null;
        int c = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || c != 0){
            int sum = c;
            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();

            ListNode temp = new ListNode(sum % 10);
            temp.next = ans;
            ans = temp;
            c = sum / 10;
        }
        return ans;
    }

    public void add(Stack<Integer> s, ListNode l){
        ListNode temp = l;
        while(temp != null){
            s.push(temp.val);
            temp = temp.next;
        }
    }
}