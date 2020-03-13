package com.crajas.leetcode.Feb8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class TweetCountsTest {

	// [null,null,null,null,[2],[2,1],null,[4]]
	// [null,null,null,null,[2],[2,1],null,[4]]
	TweetCounts ts = new TweetCounts();
		

	@Test
	void test() {

		 TweetCounts tweetCounts = new TweetCounts();
		 tweetCounts.recordTweet("tweet3", 0);
		 tweetCounts.recordTweet("tweet3", 60);
		 tweetCounts.recordTweet("tweet3", 10);                             // All tweets correspond to "tweet3" with recorded times at 0, 10 and 60.
		 List<Integer> list = tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 59); // return [2]. The frequency is per minute (60 seconds), so there is one interval of time: 1) [0, 60> - > 2 tweets.
		 assertEquals(1, list.size());
		 assertEquals(2, list.get(0));
		 list = tweetCounts.getTweetCountsPerFrequency("minute", "tweet3", 0, 60); // return [2, 1]. The frequency is per minute (60 seconds), so there are two intervals of time: 1) [0, 60> - > 2 tweets, and 2) [60,61> - > 1 tweet.
		 assertEquals(2, list.size());
		 assertEquals(2, list.get(0));
		 assertEquals(1, list.get(1));
		 tweetCounts.recordTweet("tweet3", 120);                            // All tweets correspond to "tweet3" with recorded times at 0, 10, 60 and 120.
		 list = tweetCounts.getTweetCountsPerFrequency("hour", "tweet3", 0, 210);	
		 assertEquals(1, list.size());
		 assertEquals(4, list.get(0));
	}

}
