class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> q =
         new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(),a.getValue()));

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        q.addAll(map.entrySet());
        List<Integer> list = new ArrayList<>();

        while(k > 0){
            Map.Entry<Integer,Integer> m = q.poll();
            int val = m.getKey();
            list.add(val);
            k--;
        }

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

        return arr;
        
    }
}
