package medium.heap.Q0355DesignTwitter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwitterTest {

    @Test
    void testOne() {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);    //User 1 posts a new tweet (id = 5)
        assertEquals(List.of(5), twitter.getNewsFeed(1));   //User 1's news feed should return a list with 1 tweet
        twitter.follow(1, 2);    // User 1 follows user 2
        twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6)
        assertEquals(List.of(6, 5), twitter.getNewsFeed(1));    //User 1's news feed should return a list with 2 tweet ids
        twitter.unfollow(1, 2);  // User 1 unfollows user 2
        assertEquals(List.of(5), twitter.getNewsFeed(1));   //User 1's news feed should return a list with 1 tweet id
    }

}