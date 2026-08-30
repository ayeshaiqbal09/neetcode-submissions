class LRUCache {
    private class Node {
        int value, key;
        Node prev, next;
        Node(int value, int key) {
            this.value = value;
            this.key = key;
            prev = null;
            next = null;
        }
    }
    private HashMap<Integer, Node> map;
    private Node head, tail;
    private int capacity;
    public LRUCache(int capacity) {
       this.head = new Node(0, 0);
       this.tail = new Node(0, 0);
       head.next = tail;
       tail.prev = head;
        this.capacity = capacity;
        this.map = new HashMap<>();
    }
    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void Addlast(Node node) {
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
    }
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);
        remove(node);
        Addlast(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            Addlast(node);
            return;
        }
        if (map.size() == capacity) {
            Node lru = head.next;
            remove(lru);
            map.remove(lru.key);
        }
        Node last = new Node(value, key);
        Addlast(last);
        map.put(key, last);
    }
}
