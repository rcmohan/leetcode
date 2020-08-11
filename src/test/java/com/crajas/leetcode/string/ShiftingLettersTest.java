package com.crajas.leetcode.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShiftingLettersTest {

	private ShiftingLetters.Solution s = new ShiftingLetters().new Solution();
	
	@Test
	void testShift() {
		assertEquals('d', s.shift('a', 3));
		assertEquals('i', s.shift('d', 5));
		assertEquals('l', s.shift('c', 9));
		assertEquals('p', s.shift('g', 9));
	}

	String[] A = {
			"rpl",
			"z"
	};
	
	String[] T = {
			"abc",
			"a"
	};
	
	int[][] S = {
			{3,5,9},
			{25}
	};
	
	
	@Test
	void testShiftLetters() {
		int i = 0;
		assertEquals(A[i], s.shiftingLetters(T[i], S[i]));
	}

}
