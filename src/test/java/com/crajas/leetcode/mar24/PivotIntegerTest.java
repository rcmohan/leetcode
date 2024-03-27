package com.crajas.leetcode.mar24;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIntegerTest {

    static PivotInteger.Solution solution;

    @BeforeAll
    public static void init() {
        solution = new PivotInteger().new Solution();
    }

    @Test
    public void testForCases() {
        assertEquals(6, solution.pivotInteger(8));
        assertEquals(1, solution.pivotInteger(1));
        assertEquals(-1, solution.pivotInteger(4));
        assertEquals(35, solution.pivotInteger(49));
    }



}