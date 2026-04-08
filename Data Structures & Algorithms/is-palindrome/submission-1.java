class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("\\s+","");
        s = s.replaceAll("\\?", "");
        s = s.replaceAll("\\,", "");
        char[] sc = s.toCharArray();
        char[] res = new char[sc.length];
        int index = 0;
        for(int i = sc.length-1; i >= 0; i-- ){
            res[index] = sc[i];
            index++;
        }

        String original = new String(sc);
        String reverse = new String(res);


        return original.toLowerCase().equals(reverse.toLowerCase());
    }
}
