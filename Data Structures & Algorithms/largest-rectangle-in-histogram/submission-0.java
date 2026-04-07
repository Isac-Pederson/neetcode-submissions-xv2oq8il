class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <= n; i++){
            while(!stack.isEmpty() && 
            (i == n || heights[stack.peek()] >= heights[i])){
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, h*w);
            }
            stack.push(i);
        }

        return max;
        
       
    }
}
