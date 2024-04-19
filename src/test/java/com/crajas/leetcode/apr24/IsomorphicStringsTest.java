package com.crajas.leetcode.apr24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    IsomorphicStrings.Solution s = new IsomorphicStrings().new Solution();

    @Test
    public void testIsomoprhism() {
        assertTrue(s.isIsomorphic("egg", "add"));
        assertFalse(s.isIsomorphic("foo", "bar"));
        assertTrue(s.isIsomorphic("paper", "title"));
        assertTrue(s.isIsomorphic("abcdabcdabcd", "gvzdgvzdgvzd"));
    }

}