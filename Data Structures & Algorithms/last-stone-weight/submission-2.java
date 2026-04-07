class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n : stones){
            
            max.add(n);
        }

       while(max.size() > 1){
            int num1 = max.poll();
            int num2 = max.poll();

            if(num2 < num1){
                max.add(num1-num2);
            }
       }

       if(!max.isEmpty()){
            int num = max.poll();
            return num;
       }
       
       return 0;
    }
}
