package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountingElementsTest {


	CountingElements.Solution sol = new CountingElements().new Solution();
	
	@Test
	void test() {
		assertEquals(2, sol.countElements(new int[] {1,2,3}));
		assertEquals(0, sol.countElements(new int[] {1,1,3,3,5,5,7,7}));
		assertEquals(3, sol.countElements(new int[] {1,3,2,3,5,0}));
		assertEquals(2, sol.countElements(new int[] {1,1,2,2}));
	}

}
