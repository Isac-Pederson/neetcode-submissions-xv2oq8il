class KthLargest {
    int kth;
    PriorityQueue<Integer> min; 

    public KthLargest(int k, int[] nums) {
        min = new PriorityQueue<>();
        kth = k;

        for(int n : nums){
            min.add(n);
            if(min.size() > kth){
                min.poll();
            }
        }
    }
    
    public int add(int val) {
        min.add(val);
        if(min.size() > kth){
            min.poll();
        }

        return min.peek();
        
    }
}
