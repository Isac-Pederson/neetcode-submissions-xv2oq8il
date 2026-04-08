class MedianFinder {
        List<Double> nums;

    public MedianFinder() {
        this.nums = new ArrayList<>();
    }
    
    public void addNum(int num) {
        nums.add(Double.valueOf(num));
    }
    
    public double findMedian() {
        if(nums != null){
                double mid = nums.size() / 2;
                if(nums.size() == 1){
                        return nums.get(0);
                }
                if(nums.size() % 2 == 0){
                        double mid2 = mid-1;
                        return (double)(nums.get((int)mid) + nums.get((int)mid2)) / 2.0;
                }
                return nums.get((int)mid);
                
        }
        return 0;
        
    }
}
