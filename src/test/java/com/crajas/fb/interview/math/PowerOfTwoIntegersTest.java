package com.crajas.fb.interview.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerOfTwoIntegersTest {

	PowerOfTwoIntegers.Solution s = new PowerOfTwoIntegers().new Solution();
	
	@Test
	void test() {
		assertEquals(0, s.isPower(16808));
		assertEquals(0, s.isPower(5));
		assertEquals(1, s.isPower(-5));
		assertEquals(1, s.isPower(9));
		assertEquals(1, s.isPower(27));
		assertEquals(1, s.isPower(16));

		
	}

}
