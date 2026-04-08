public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length) return false;

        var matchedRes = new List<int>();


        foreach(char c in s){
            foreach(char j in t){
                if (c == j){
                    matchedRes.Add(c);
                    break;
                }
            }
        }
        foreach (char c in matchedRes){
            Console.WriteLine(c);
        }


        return matchedRes.Count == s.Length;


    }
}
