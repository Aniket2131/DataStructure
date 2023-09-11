public class Q707{
    public static void main(String[] args) {
        
    }

    class MyLinkedList {

        Node head;
        int length;
        public class Node{
            int val;
            Node next;
    
            Node(int val){
                this.val = val;
            }
        }
    
        public MyLinkedList() {
            this.length = 0;
            this.head = null;
        }
        
        public int get(int index) {
            if(index >= length) return -1;
    
            Node temp = head;
            while(index > 0){
                temp = temp.next;
                index--;
            }
            return temp.val;     
        }
        
        public void addAtHead(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            length++;
        }
        
        public void addAtTail(int val) {
            Node temp = new Node(val);
            if(head == null){
                temp.next = head;
                head = temp;
                length++;
                return;
            }
            Node temp2 = head;
            while(temp2.next != null) temp2 = temp2.next;
            temp2.next = temp;
            temp2.next.next = null;
            length++;
        }
        
        public void addAtIndex(int index, int val) {
            if(index > length) return;
            if(index == 0) addAtHead(val);
            else{
                Node temp = head;
                while(index-1 > 0){
                    temp = temp.next;
                    index--;
                }
                Node newNode = new Node(val);
                Node headnext = temp.next;
                temp.next = newNode;
                newNode.next = headnext;
                length++;
            }
        }
        
        public void deleteAtIndex(int index) {
            if(index >= length) return;
            if(index == 0){
                head = head.next;
                length--;
            }
            else{
                Node temp = head;
                while(index-1 > 0){
                    temp = temp.next;
                    index--;
                }
                temp.next = temp.next.next;
                length--;
            }
        }
    }
}