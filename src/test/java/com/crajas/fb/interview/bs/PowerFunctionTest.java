package com.crajas.fb.interview.bs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerFunctionTest {

	PowerFunction.Solution s = new PowerFunction().new Solution();
	
	@Test
	void test() {
		assertEquals(2, s.pow(2, 13, 3));
		assertEquals(19, s.pow(-1, 1, 20));
		assertEquals(20805472, s.pow(71045970, 41535484, 64735492));
	}

}
