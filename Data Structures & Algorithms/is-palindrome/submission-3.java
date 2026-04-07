class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int right = s.length() - 1;
        for(int left = 0;left < s.length() / 2 ; left++){
           if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
           } 
           right--;
        }


        return true;
    }
}
