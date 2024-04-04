package com.crajas.leetcode.mar24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {
    FirstMissingPositive.Solution s = new FirstMissingPositive().new Solution();

    @Test
    public void test() {
        int ans = s.firstMissingPositive(new int[] {1,2,0});
        assertEquals(3, ans);

        ans = s.firstMissingPositive(new int[] {3,4,-1,1});
        assertEquals(2, ans);

    }
}
