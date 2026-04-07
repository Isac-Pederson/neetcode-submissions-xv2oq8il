class Node{
    int key;
    int val;
    Node next;
    Node prev;

    Node(int key, int val){
        this.val = val;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    int cap;
    Node left;
    Node right;
    HashMap<Integer, Node> cache;


    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;

    }

    public void add(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }

    public void remove(Node node){
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            add(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node node = new Node(key,value);
        cache.put(key, node);
        add(node);
        if(cap < cache.size()){
            Node next = this.left.next;
            remove(next);
            cache.remove(next.key);
        }
    }
}
