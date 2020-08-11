package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LetterApartTest {

	LetterApart la = new LetterApart();
	
	@Test
	void test() {
		assertTrue(la.oneEditApart("abc", "abdc"));
		assertTrue(la.oneEditApart("abc", "ac"));
		assertTrue(la.oneEditApart("abc", "adc"));
		assertTrue(la.oneEditApart("abcdefghij", "abcdefghi"));
		assertTrue(la.oneEditApart("abcdddd", "abcddd"));
		assertTrue(la.oneEditApart("aaaaaa", "aaaaa"));
		
		
		assertFalse(la.oneEditApart("abcdddd", "abcdddddddd"));
		assertFalse(la.oneEditApart("aaaaaaa", "aaaaaaaaaaaa"));
		
		assertFalse(la.oneEditApart("aaabaaaa", "aaabaaaaaaaaa"));
		assertFalse(la.oneEditApart("aaabaaaa", "aaaaaaaaabaaa"));
		
	}

}
