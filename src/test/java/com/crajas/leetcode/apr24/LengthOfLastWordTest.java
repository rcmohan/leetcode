package com.crajas.leetcode.apr24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    private static final LengthOfLastWord.Solution s = new LengthOfLastWord().new Solution();

    @Test
    public void test() {
        assertEquals(5, s.lengthOfLastWord("Hello World"));
        assertEquals(4, s.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, s.lengthOfLastWord("fluffy is still joyboy"));
        assertEquals(3, s.lengthOfLastWord("Today is a nice day"));
    }
}