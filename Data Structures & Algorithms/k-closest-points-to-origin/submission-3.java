class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Map.Entry<Double,int[]>> min = new PriorityQueue<>(Comparator.comparing(Map.Entry::getKey));


        for(int i = 0; i < points.length; i++){
            int[] pair = points[i];
            double distance = Math.sqrt(Math.pow(pair[0],2) + Math.pow(pair[1],2));
            min.add(Map.entry(distance, pair));
        }

        List<int[]> list = new ArrayList<>();
        while(k > 0){
            int[] val = min.poll().getValue();
            list.add(val);
            k--;
        }
        int[][] res= list.toArray(new int[list.size()][]);

        return res;

    }
}
