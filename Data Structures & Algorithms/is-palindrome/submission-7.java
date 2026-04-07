class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(!Character.isLetterOrDigit(s.charAt(right)) && left < right){
                right--;
            };
            while(!Character.isLetterOrDigit(s.charAt(left)) && left < right){
                left++;
            };
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            right--;
            left++;
        }

        return true;
        
    }
}
