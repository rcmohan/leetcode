package com.crajas.leetcode.mar24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {

    @Test
    public void test() {
        MinimumCommonValue.Solution s = new MinimumCommonValue().new Solution();
        int ans = s.getCommon(new int[] {1, 2, 3}, new int[] {2, 4});
        assertEquals(2, ans);
        ans = s.getCommon(new int[] {1,2,3,6}, new int[] {2,3,4,5});
        assertEquals(2, ans);
        ans = s.getCommon(new int[] {1,2,3,4,5,6,7,8,9,10}, new int[] {11, 12,13,14,15});
        assertEquals(-1, ans);
    }
}