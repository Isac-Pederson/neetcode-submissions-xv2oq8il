public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {


        List<List<string>> results = new List<List<string>>();
            
            for(int i = 0; i < strs.Length; i++){
                for (int j=0; j < strs[i].Length; j++){
                    for(int k = 0; k < strs[i].Length; k++){
                    char currChar = strs[i][j];
                    char nextChar = strs[i+1][k];
                    if(strs[i].Length != strs[i+1].Length || strs[i+1] == null || nextChar == null){
                        break;
                    }else if (currChar == nextChar){
                        int count = 0;
                        count++;
                        if(count == strs[i].Length){
                            
                        }
                    }

                    }

                }

            } 
            return results;
        
    }
}
