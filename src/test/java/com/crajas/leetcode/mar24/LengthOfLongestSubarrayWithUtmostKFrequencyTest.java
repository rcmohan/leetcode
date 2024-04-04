package com.crajas.leetcode.mar24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubarrayWithUtmostKFrequencyTest {

    LengthOfLongestSubarrayWithUtmostKFrequency.Solution s = new LengthOfLongestSubarrayWithUtmostKFrequency().new Solution();

    @Test
    public void test() {
        int out = s.maxSubarrayLength(new int[] {1,2,3,1,2,3,1,2}, 2);
        assertEquals(6, out);

        out = s.maxSubarrayLength(new int[] {1,2,1,2,1,2,1,2}, 1);
        assertEquals(2, out);

        out = s.maxSubarrayLength(new int[] {5,5,5,5,5,5,5}, 4);
        assertEquals(4, out);

        out = s.maxSubarrayLength(new int[] {1,11}, 2);
        assertEquals(2, out);

        out = s.maxSubarrayLength(new int[] {1,4,4,3}, 2);
        assertEquals(2, out);
    }

}