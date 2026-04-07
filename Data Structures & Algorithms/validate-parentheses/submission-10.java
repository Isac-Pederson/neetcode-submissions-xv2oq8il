class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();


        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }
                char val = stack.pop();
                if(map.get(c) != val ){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        return stack.size() == 0;
        
    }
}
