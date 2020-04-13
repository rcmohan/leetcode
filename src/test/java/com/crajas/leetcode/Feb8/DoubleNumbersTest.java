package com.crajas.leetcode.Feb8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoubleNumbersTest {

	static DoubleNumbers.Solution dn = new DoubleNumbers().new Solution(); 
	
	static int [][] arrs = {
			{10,2,5,3},
			{7,1,14,11},
			{3,1,7,11},
			{-16,-13,8}
	};
	
	@Test
	void test() {
		assertTrue(dn.checkIfExist(arrs[0]));
		assertTrue(dn.checkIfExist(arrs[1]));
		assertFalse(dn.checkIfExist(arrs[2]));
		assertFalse(dn.checkIfExist(arrs[3]));
	}

}
