package com.crajas.fb.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WaysToDecodeTest {

	WaysToDecode.Solution s = new WaysToDecode().new Solution();
	
	@Test
	void test() {
		assertEquals(2, s.numDecodings("12"));
		assertEquals(1, s.numDecodings("7"));
		assertEquals(2, s.numDecodings("712"));
		
		
	}

}
