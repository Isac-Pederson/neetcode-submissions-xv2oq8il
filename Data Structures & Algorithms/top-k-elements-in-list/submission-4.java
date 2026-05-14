class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            q.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        int[] res = new int[k];

        while(k > 0){
            res[k-1] = q.poll()[0];
            k--;
        }

        return res;
        
    }
}
