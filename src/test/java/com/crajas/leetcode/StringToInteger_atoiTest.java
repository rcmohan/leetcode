package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringToInteger_atoiTest {

	static StringToInteger_atoi.Solution s = new StringToInteger_atoi().new Solution();

	@Test
	void testAtoi() {
		
		assertEquals(1, s.myAtoi("1"));
		
		assertEquals(Integer.MIN_VALUE, s.myAtoi("-91283472332"));
		assertEquals(Integer.MAX_VALUE, s.myAtoi("91283472332"));
		assertEquals(Integer.MAX_VALUE, s.myAtoi("91283472332"));
		assertEquals(12345678, s.myAtoi("  0000000000012345678"));
		assertEquals(0, s.myAtoi("    0000000000000   "));
		assertEquals(-1, s.myAtoi("-000000000000001"));
		assertEquals(4193, s.myAtoi("4193 with words"));
		assertEquals(520, s.myAtoi(" 520"));
		assertEquals(5, s.myAtoi("  5.2 "));
		assertEquals(0, s.myAtoi(""));

		assertEquals(4193, s.myAtoi("+4193 with words"));
		assertEquals(520, s.myAtoi(" +520"));
		assertEquals(5, s.myAtoi("  +5.2 "));
		assertEquals(0, s.myAtoi("+.1"));
		assertEquals(0, s.myAtoi("+-2"));
		assertEquals(-12, s.myAtoi("  -0012a42"));

		assertEquals(-4193, s.myAtoi("-4193 with words"));
		assertEquals(-520, s.myAtoi(" -520"));
		assertEquals(-5, s.myAtoi("  -5.2 "));
		assertEquals(0, s.myAtoi("-.1"));
		assertEquals(0, s.myAtoi("abc"));
		assertEquals(-5, s.myAtoi("  -5-"));

	}

	@Test
	public void testRemoveLeadingZeros() {
		assertEquals("1231", s.removeLeadingZeroes("0000000001231"));
		assertEquals("1231", s.removeLeadingZeroes("00000000000000000000000000000000000000001231"));
		assertEquals("1231", s.removeLeadingZeroes("000000000000000001231"));
		
	}
	
	
	
	@Test
	void testFilter() {
		assertEquals("123", s.filter("123 with words"));
		assertEquals("0", s.filter("with 123 words"));
		assertEquals("0", s.filter("with words 123"));
		assertEquals("1", s.filter("1.23e10 words"));
		assertEquals("-1", s.filter("-1.23e10 words"));
		assertEquals("1", s.filter("1.23 words"));
		assertEquals("-1", s.filter("-1.23 words"));
		assertEquals("123", s.filter("123 words"));
		
	}
	
}
