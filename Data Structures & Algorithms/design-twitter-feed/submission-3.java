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
        count++;
        tweetMap.computeIfAbsent(userId , k -> new ArrayList<>()).add(Arrays.asList(count, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<List<Integer>> min = new PriorityQueue<>((a,b) -> Integer.compare(b.get(0), a.get(0)));
        List<List<Integer>> tweets = tweetMap.get(userId);
        if(tweets != null){
            for(List<Integer> tweet : tweets){
                min.add(tweet);
                if(min.size() > 10){
                    min.poll();
                }
            }
        }


        HashSet<Integer> following = followMap.get(userId);
        if(following != null){
            for(int user : following){
                List<List<Integer>> userTweets = tweetMap.get(user);
                if(userTweets != null){
                    for(List<Integer> tweet : userTweets){
                        min.add(tweet);
                        if(min.size() > 10){
                            min.poll();
                        }
                    }
                }
            }
        }
        List<Integer> result = new ArrayList<>();
    
        while(!min.isEmpty()){
            result.add(min.poll().get(1));
        }
        return result;
        
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId != followeeId){
            followMap.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        followMap.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }
}
