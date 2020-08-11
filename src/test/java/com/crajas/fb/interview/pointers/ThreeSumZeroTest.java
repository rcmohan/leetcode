package com.crajas.fb.interview.pointers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ThreeSumZeroTest {

	ThreeSumZero.Solution s = new ThreeSumZero().new Solution();
	
	@Test
	void test() {
		List<Integer> Q = Arrays.asList(5, 7, 7, 8, 8, 10, 12, 34, 43, 45, 76, 87, 89, 96);
		assertTrue(s.search(Q, 12));
		assertTrue(s.search(Q, 34));
		assertTrue(s.search(Q, 7));
		assertFalse(s.search(Q, 77));
		Q = Arrays.asList(-1, 0, 1, 2, -1, -4);
		ArrayList<Integer> AQ = new ArrayList<Integer>();
		AQ.addAll(Q);
		System.out.println(s.threeSum(AQ));
	}

}
