class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for(char task : tasks){
            count[task - 'A']++;
        }

        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

        for(int num : count){
            if(num > 0){
                max.add(num);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        int time = 0;

        while(!max.isEmpty() || !q.isEmpty()){
            time++;
            if(max.isEmpty()){
                time = q.peek()[1];
            }else{
                int cnt = max.poll() - 1;
                if(cnt > 0){
                    q.add(new int[] {cnt, time + n});
                }
            }

            if(!q.isEmpty() && q.peek()[1] == time){
                max.add(q.poll()[0]);
            }
        }

        return time;
        
    }
}
