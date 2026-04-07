class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Map.Entry<Double,int[]>> min = new PriorityQueue<>(Comparator.comparing(Map.Entry::getKey));


        for(int i = 0; i < points.length; i++){
            int[] pair = points[i];
            double distance = Math.sqrt(pair[0] * pair[0] + pair[1] * pair[1]);
            System.out.println(distance);
            System.out.println("PAIR1 " + pair[0] + " PAIR2 " + pair[1]);
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
