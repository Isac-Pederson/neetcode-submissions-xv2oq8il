class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] sc = s.toCharArray();
        char[] res = new char[sc.length];
        int index = 0;
        for(int i = sc.length-1; i >= 0; i-- ){
            res[index] = sc[i];
            index++;
        }

        String original = new String(sc);
        String reverse = new String(res);

        System.out.println(original.toLowerCase());
        System.out.println(reverse.toLowerCase());
        return original.toLowerCase().equals(reverse.toLowerCase());
    }
}
