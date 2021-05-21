class LRUCache {
    static int cap;
    static LinkedList<Integer> q;
    static HashMap<Integer,Integer> hs;
    public LRUCache(int capacity) {
          q = new LinkedList<>();
          cap =capacity;
          hs = new HashMap<Integer,Integer>();
    }
    
    public int get(int key) {
        if(hs.containsKey(key))
        {   
            q.remove(new Integer(key));
            q.add(key);
            return hs.get(key);
        }else{
           return -1; 
        }
    }
    
    public void put(int key, int value) {
       if(hs.containsKey(key))
        {
            hs.put(key,value);
            q.remove(new Integer(key));
            q.add(key);
        }
         else if(q.size()==cap)
        {
            int po=q.poll();
            hs.remove(po);
            q.add(key);
            hs.put(key,value);
        }
        else{
            q.add(key);
            hs.put(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */


class Node {
    Node prev, next;
    int key, value;
    
    public Node(int key, int value) {
        this.key = key;
       this.value = value; 
    }
}
class LRUCache {
    int capacity;
    Map<Integer, Node> map;
    Node head, tail;
    
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            moveToTail(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToTail(node);
            return;
        }
        
        if (map.size() == capacity) {
            int rst = head.next.key;
            evictNode(head.next);
            map.remove(rst);
        }
        
        
        Node node = new Node(key, value);
        map.put(key, node);
        addToTail(node);
    }
    
    public void evictNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    
    public void moveToTail(Node node) {
        evictNode(node);
        addToTail(node);
    }
    
    public void addToTail(Node node) {
        Node prevNode = tail.prev;
        prevNode.next = node;
        node.prev = prevNode;
        tail.prev = node;
        node.next = tail;
    }
}
