package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitwiseANDTest {

	BitwiseAND band = new BitwiseAND();
	BitwiseAND.Solution s = band.new Solution();
	
	@Test
	void test() {
		int l = 72;
		int m = 78;
		assertEquals(band.rangeBitwiseAnd1(l, m), s.rangeBitwiseAnd(l, m));
		
		assertEquals(5, band.bitlength(16));
		assertEquals(7, band.bitlength(87));
		assertEquals(10, band.bitlength(1023));
		assertEquals(0, band.bitlength(0));
		assertEquals(1, band.bitlength(1));
	}

}
