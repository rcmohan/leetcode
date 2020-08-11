package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestRepeatedSubsequenceTest {

	LongestRepeatedSubsequence lrs = new LongestRepeatedSubsequence();
	
	
	@Test
	void test() {
		assertEquals(4, lrs.findLRS("ABCDE", "ABDCEF"));
		assertEquals(2, lrs.findLRS("ABCD", "ADCB"));
		assertEquals(2, lrs.findLRS("ABCDEF", "AFEDCB"));
		assertEquals(10, lrs.findLRS("ATACTCGGA", "ATACTCGGA"));
		assertEquals(0, lrs.findLRS("ATACTCGGA", "XYZJKLM"));
		
	}

}
