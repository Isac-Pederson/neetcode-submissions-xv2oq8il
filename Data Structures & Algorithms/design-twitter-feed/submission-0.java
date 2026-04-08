class Twitter {
    HashMap<Integer, HashSet<Integer>> followMap; 
    HashMap<Integer, List<List<Integer>>> tweetMap; 
    int count;

    public Twitter() {
        this.count = 0;
        this.followMap = new HashMap<>();
        this.tweetMap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        count--;
        tweetMap.computeIfAbsent(userId , k -> new ArrayList<>()).add(Arrays.asList(count, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<List<List<Integer>>> min = new PriorityQueue<>(Comparator.comparingInt(list -> list.get(0).get(0)));
        List<List<Integer>> tweets = tweetMap.get(userId);
        min.add(tweets);


        HashSet<Integer> following = followMap.get(userId);
        if(following != null){
            for(int user : following){
                List<List<Integer>> userTweets = tweetMap.get(user);
                min.add(userTweets);
                if(min.size() > 10){
                    min.poll();
                }
            }
        }
        List<Integer> result = new ArrayList<>();
    
        while(!min.isEmpty()){
            List<List<Integer>> list= min.poll();
            for(List item : list){
                System.out.println(item.get(1));
                result.add((int)(item.get(1)));
            }
        }
        return result;
        
    }
    
    public void follow(int followerId, int followeeId) {
        followMap.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        HashSet<Integer> set = followMap.get(followerId);
        set.remove(followeeId);
    }
}
