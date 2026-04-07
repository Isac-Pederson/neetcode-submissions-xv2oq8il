class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a count map and freq list
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1]; 

        //set each index to a new arrayList, otherwise this would be null right?
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int n: nums){
            //n as key, count as value - starting at 0 and +1 each time seen 
            count.put(n,count.getOrDefault(n,0)+1);
        }
        //Taking the map COUNT and setting each number to the index (which is now our count)
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        //create int array that has size set to k 
        int[] res =  new int[k];
        int index = 0;
        // Q: what does the -1 do?
        
        // A: We set freq to +1 of nums.length because we need 1-6 not 0-5. That makes our
        // list 7 long, which is out of bounds of our indices. We are basically accounting for 0 here
        
        // What is index doing? 
        // 
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                //if NO n(number) in freq[i] it is skipped
                //here index goes because it is our first match and is used to see if we have met k amount of freqencies
                res[index++] = n;
                //once we match freq we can return early as that is our answer
                if(index == k){
                    return res;
                }
            }

        }

        //We don't return early if 

        return new int[0]; 

    }
}
