class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(right)) && left < right){
                right--;
                continue;
            };
            if(!Character.isLetterOrDigit(s.charAt(left)) && left < right){
                left++;
                continue;
            };
            // System.out.println("LEFT: " + s.charAt(left));
            // System.out.println("RIGHT: " + s.charAt(right));
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            right--;
            left++;

        }

        return true;
        
    }
}
