class KthLargest {
    
    List<Integer> list = new ArrayList<>();
    int kth = 0;
    public KthLargest(int k, int[] nums) {
        for(int n : nums){
            list.add(n);
        }
        kth = k;
    }
    
    public int add(int val) {
        list.add(val);
        int size = list.size();
        int[] listArray = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(listArray);

        return listArray[size - kth];
        
    }
}
