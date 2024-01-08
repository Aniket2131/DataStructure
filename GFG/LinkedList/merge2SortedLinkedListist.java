public class merge2SortedLinkedListist {
    public static void main(String[] args) {

    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node mergeResult(Node node1, Node node2) {
        // Your code here
        Node pre = new Node(-1);
        if (node1 == null && node2 == null)
            return null;

        else if (node1 == null && node2 != null) {
            reverse(pre, node2);
            return pre.next;
        } else if (node1 != null && node2 == null) {
            reverse(pre, node1);
            return pre.next;
        }
        if (node1.data < node2.data) {
            Node nex = node1.next;
            pre.next = node1;
            node1.next = null;
            node1 = nex;
        } else {
            Node nex = node2.next;
            pre.next = node2;
            node2.next = null;
            node2 = nex;
        }

        while (node1 != null && node2 != null) {

            if (node1.data < node2.data) {
                Node nex = node1.next;
                node1.next = pre.next;
                pre.next = node1;
                node1 = nex;
            } else {
                Node nex = node2.next;
                node2.next = pre.next;
                pre.next = node2;
                node2 = nex;
            }

        }
        reverse(pre, node1);
        reverse(pre, node2);
        return pre.next;
    }

    void reverse(Node pre, Node head) {
        while (head != null) {
            Node nex = head.next;
            head.next = pre.next;
            pre.next = head;
            head = nex;
        }
    }
}