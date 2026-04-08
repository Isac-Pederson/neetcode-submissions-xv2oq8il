class LRUCache {
    LinkedHashMap<Integer, Integer> map;
    int count = 0;

    public LRUCache(int capacity) {
        count = capacity;
        map = new LinkedHashMap<Integer,Integer>(){
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
                return size() > capacity;
            }
        }; 
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        map.put(key,value);
    }
}

