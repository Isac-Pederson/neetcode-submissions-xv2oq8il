public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length) return false;

        var matchedRes = new List<char>();

        for(int c=0;c<s.Length; c++){
            for(int j = 0; j<t.Length; j++){
                if (s[c] == t[j]){
                    matchedRes.Add(s[c]);
                    t = t.Remove(j,1);
                    break;
                }
            }
        }

        return matchedRes.Count == s.Length;


    }
}
