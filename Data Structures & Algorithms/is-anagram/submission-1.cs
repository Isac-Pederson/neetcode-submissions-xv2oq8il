public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length) return false;

        var matchedRes = new List<int>();


        foreach(char c in s){
            if(matchedRes.Contains(c)){
                break;
            }
            foreach(char j in t){
                if (c == j){
                    matchedRes.Add(c);
                }
            }
        }
        foreach (char c in matchedRes){
            Console.WriteLine(c);
        }


        return matchedRes.Count == s.Length;


    }
}
