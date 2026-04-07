class Node{
    Node prev;
    Node next;
    int key;
    int val;

    Node(int key, int val){
        this.prev = null;
        this.next = null;
        this.key = key;
        this.val = val;
    }
}


class LRUCache {

    HashMap<Integer, Node> cache;
    Node left;
    Node right;
    int cap;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>(); 
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.right.prev = this.left;
        this.left.next = this.right;
    }

    private void remove(Node node){
        Node p = node.prev;
        Node n = node.next;
        p.next = n;
        n.prev = p;
    }

    private void add(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
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
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        add(newNode);

        if(cache.size() > cap){
            Node n = this.left.next;
            remove(n);
            cache.remove(n.key);
        }
        
    }
}
