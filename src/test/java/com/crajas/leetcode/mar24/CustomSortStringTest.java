package com.crajas.leetcode.mar24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortStringTest {
    static CustomSortString.Solution s;
    @BeforeEach
    void setUp() {
        s = new CustomSortString().new Solution();
    }

    @Test
    void testABC() {
        String ans = s.customSortString("cba", "abcd");
        assertTrue("cbad".equals(ans) || "dcba".equals(ans) || "cdba".equals(ans) || "cbda".equals(ans));

        ans = s.customSortString("bcafg", "abcd");
        assertTrue("bcad".equals(ans) || "bacd".equals(ans) || "bcda".equals(ans));


    }
}