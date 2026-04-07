class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length() - 1;
        for(int left = 0;left < s.length() / 2 ; left++){
        if(!Character.isLetterOrDigit(s.charAt(left))){
            continue;
        }
        while(!Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
           if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
           } 
           right--;
        }


        return true;
    }
}
