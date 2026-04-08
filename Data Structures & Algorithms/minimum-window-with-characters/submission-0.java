class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }

        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }


        int have = 0;
        int need = freq.size();
        int l = 0;
        int[] resSub = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c,0)+1);
            if(freq.containsKey(c) && window.get(c).equals(freq.get(c))){
                have++;
            }

            while(have == need){
                if((r-l+1) < resLen){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
            }

            char lc = s.charAt(l);
            window.put(lc, window.get(lc) -1);
            if(freq.contains(lc) && window.get(lc) < freq.get(lc)){
                have--;
            }
            l++;
        }
    return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1] +1);
}

        
}
