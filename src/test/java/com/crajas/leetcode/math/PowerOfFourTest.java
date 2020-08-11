package com.crajas.leetcode.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PowerOfFourTest {

	PowerOfFour.Solution s = new PowerOfFour().new Solution();
	@Test
	void test() {
		int p = 4;
		List<Integer> x = new ArrayList<Integer>();
		
		while(p > 0) {
			x.add(p);
			int q = p >> 1;
			p *= 4;
			
		}

		p = 8;
		p >>= 1;
		System.out.println(p + " = " + (p & -p));
		
		int j = 0;
		int y = x.get(j);
		System.out.println(y);
		for (int i = 3; i < Integer.MAX_VALUE; i++) {
			
			if(i == y) {
				assertTrue(s.isPowerOfFour(y), "Failed for " + i);
				j ++;
				y = x.get(j);
				System.out.println(y);
			} else 
			assertFalse(s.isPowerOfFour(i), "Failed for " + i);
		}
	}

}
