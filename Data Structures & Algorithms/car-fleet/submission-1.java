class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int[][] pair = new int[position.length][2]; 

        //create pair
        for(int i = 0; i< position.length; i++){
            pair[i] = new int[]{position[i], speed[i]};
        }

        //sort
        Arrays.sort(pair,(a,b) -> Integer.compare(b[0], a[0]));

        for(int i = 0; i < position.length; i++){
            double steps = (double)(target - pair[i][0]) / pair[i][1];
            System.out.println(steps);
            if(stack.isEmpty()){
                stack.push(steps);
            }else{
                if(steps > stack.peek()){
                    stack.push(steps);
                }
            }
        }

        



        return stack.size(); 

        
    }
}
