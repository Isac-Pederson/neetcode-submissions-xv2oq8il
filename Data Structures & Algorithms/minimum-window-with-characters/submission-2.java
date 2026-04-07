class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();


        for(char c : t.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        int l = 0;
        int have = 0;
        int need = freq.size();
        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;

        for(int r =0; r < s.length(); r++){
            char c =  s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            
            if(freq.containsKey(c) && freq.get(c).equals(window.get(c))){
                have++;
            }
            
            while(have == need){
                if((r-l+1) < resLen){
                    resLen = r-l+1;
                    res[0] = l; 
                    res[1] = r; 
                }

                char lc = s.charAt(l);
                window.put(lc,window.get(lc)-1);
                if(freq.containsKey(lc) && freq.get(lc) > window.get(lc)){
                    have--;
                }
                l++;
            }


        } 

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);



    }
}
