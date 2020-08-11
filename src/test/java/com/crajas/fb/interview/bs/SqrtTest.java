package com.crajas.fb.interview.bs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqrtTest {

	Sqrt.Solution s = new Sqrt().new Solution();
	
	@Test
	void test() {
		assertEquals(5, s.sqrt(25));
		assertEquals(1, s.sqrt(1));
		assertEquals(3, s.sqrt(11));
		assertEquals(1, s.sqrt(3));
		assertEquals(46340, s.sqrt(2147483647));
	}

}
