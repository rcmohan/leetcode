package com.crajas.leetcode.mar24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayProductLessThanKTest {

    SubarrayProductLessThanK.Solution s = new SubarrayProductLessThanK().new Solution();

    @Test
    public void test() {
        int x = s.numSubarrayProductLessThanK(new int[] {10,5,2,6}, 100);
        assertEquals(8, x);
        x = s.numSubarrayProductLessThanK(new int[] {10,9,10,4,3,8,3,3,6,2,10,10,9,3}, 19);
        assertEquals(18, x);
        x = s.numSubarrayProductLessThanK(new int[] {100,2,3,4,100,5,6,7,100}, 100);
        assertEquals(11, x);
        x = s.numSubarrayProductLessThanK(new int[] {1,2,3,4,1,1,1,1}, 100);
        assertEquals(36, x);
        x = s.numSubarrayProductLessThanK(new int[] {6,8,6,6,10,8,10,3,7,7,4,9,3,1}, 121);
        assertEquals(30, x);


    }

}