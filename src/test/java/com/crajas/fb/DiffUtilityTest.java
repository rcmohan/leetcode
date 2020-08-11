package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiffUtilityTest {

	DiffUtility du = new DiffUtility();
	
	@Test
	void test() {
//		assertEquals(4, du.diff("XMJYAUZ", "XMJAATZ"));
//		assertEquals(8, du.diff("ABCDFGHJQZ", "ABCDEFGIJKRXYZ"));
		assertEquals(3, du.diff("ABC", "AABBCC"));
	}

}
