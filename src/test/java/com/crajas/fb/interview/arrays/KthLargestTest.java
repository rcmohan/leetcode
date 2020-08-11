package com.crajas.fb.interview.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthLargestTest {

	int[][][] TESTS = {
			{ {1, 2, 3}, {4, 5, 6} },
			{ {1, 3, 5}, {2, 4, 6} }
	};
	int[] TNDX = { 3, 3 };
	
	int ANS[] = {4, 4};
	
	KthLargest t = new KthLargest();
	
	@Test
	void test() {
		int j  = TESTS.length;
		while(j -- > 0) {
			assertEquals(ANS[j], t.kth(TESTS[j], TNDX[j]));
			System.out.println();
		}
	}

}
