package medium.heap.Q0355DesignTwitter;


import java.util.*;

/*

https://leetcode.com/problems/design-twitter/

Hash Table, Linked List, Design, Heap (Priority Queue)

 */

public class Twitter {
    private final int FEED_LEN = 10;

    private int time;
    private Map<Integer, List<int[]>> tweetMap = new HashMap<>();  // userId -> list of tweets. A tweet is defined as time, id pair
    private Map<Integer, Set<Integer>> followMap = new HashMap<>();     // userId -> set of ids the user follows

    public void postTweet(int userId, int tweetId) {
        tweetMap
            .computeIfAbsent(userId, k -> new ArrayList<>())
            .add(new int[]{time--, tweetId})    //Negative time trick, instead of defining a custom comparator
        ;
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        //The result needs to include user's own tweets
        followMap.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);

        for (int followeeId: followMap.get(userId)) {   //For each user this user follows
            if (tweetMap.containsKey(followeeId)) { //Get tweets
                var tweets = tweetMap.get(followeeId);
                int index = tweets.size() - 1;  //index of the user's latest tweet
                var tweet = tweets.get(index);  //latest tweet
                //tweet time (ordering criteria  for the heap), tweet id, followeeId, index
                //We put the latest tweet for each user the target user follows into a min heap
                minHeap.offer(new int[]{tweet[0], tweet[1], followeeId, index});
            }
        }

        while (!minHeap.isEmpty() && result.size() < FEED_LEN) {
            //The merge part
            //We look at the latest tweets for each user, the heap helps us find out which one of them is the most recent
            var curr = minHeap.poll();
            //Add this tweet to the result
            result.add(curr[1]);
            //And then take the next latest tweet from the same user
            //As in the merge sort algorithm
            int index = curr[3];
            if (index > 0) {
                var tweet = tweetMap.get(curr[2]).get(index - 1);
                minHeap.offer(new int[]{tweet[0], tweet[1], curr[2], index - 1});
            }
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {
        followMap
            .computeIfAbsent(followerId, k -> new HashSet<>())
            .add(followeeId)
        ;
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(followeeId);
        }
    }

}
