class TimeMap {
    Map<String, List<Pair<Integer,String>>> m;

    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> values = m.getOrDefault(key, new ArrayList<>());
        int r = values.size() -1;
        int l = 0;
        String res = "";

        while(l<=r){
            int m = (l + r) / 2;
            if(values.get(m).getKey() <= timestamp){
                res = values.get(m).getValue(); 
                l = m+1;
            }else{
                r = m-1;
            }
        }

        return res;


        
    }


}

class Pair<K,V>{
    final K k;
    final V v;

    public Pair(K key, V value){
        this.k = key;
        this.v = value;
    }

    public K getKey(){
        return k;
    }

    public V getValue(){
        return v;
    }


}
