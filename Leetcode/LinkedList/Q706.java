public class Q706 {

    private int size = 997;
    private Node[] nodeHeads = new Node[size];

    private class Node {
        int key;
        int val;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }

    public void put(int key, int value) {
        int ind = key % size;
        Node temp = nodeHeads[ind];
        if (temp == null) {
            nodeHeads[ind] = new Node(key, value);
            return;
        }
        Node prev = temp;
        while (temp != null) {
            if (temp.key == key) {
                temp.val = value;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        prev.next = new Node(key, value);
    }

    public int get(int key) {
        int ind = key % size;
        Node temp = nodeHeads[ind];
        while (temp != null) {
            if (temp.key == key) {
                return temp.val;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void remove(int key) {
        int ind = key % size;
        Node temp = nodeHeads[ind];
        if (temp == null)
            return;
        if (temp.key == key) {
            nodeHeads[ind] = nodeHeads[ind].next;
        }
        while (temp.next != null) {
            if (temp.next.key == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}