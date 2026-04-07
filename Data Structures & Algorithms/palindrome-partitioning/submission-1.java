class Solution {
    List<List<String>> res = new ArrayList<>();
    List<String> part = new ArrayList<>();
    public List<List<String>> partition(String s) {
        bt(s,0,0);
        return res;
    }

    void bt(String s,int i, int j){
        if(j >= s.length()){
            if(i == j){
                res.add(new ArrayList<>(part));
            }
            return;
        }

        if(isPali(s,i,j)){
            part.add(s.substring(i,j+1));
            bt(s,j+1,j+1);
            part.remove(part.size()-1);
        }
        bt(s,i,j+1);

    }


    boolean isPali(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
