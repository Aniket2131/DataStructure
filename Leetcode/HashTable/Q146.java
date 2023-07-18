import java.util.HashMap;

public class Q146{
    class LRUCache{
        int c;
        LRUCache(int _c){
            c = _c;
        }
    }
    public static void main(String[] args) {
        
    }

    HashMap<Integer, Node> map  = new HashMap<>();
    int s = 0;
    Node head = new Node(0 ,0), tail = new Node(0, 0);
    public void LRUCache(int capacity) {
        s = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == s){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node){
        map.put(node.key, node);
        Node temp = head.next;
        head.next = node;
        node.prev = head;
        temp.prev = node;
        node.next = temp;
    }

    class Node{
        Node prev, next;
        int key, value;
        public Node(int _key, int _value){
            key = _key;
            value = _value;
        }
    }
}