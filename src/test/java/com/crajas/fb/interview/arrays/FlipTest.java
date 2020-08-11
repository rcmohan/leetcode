package com.crajas.fb.interview.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class FlipTest {

	Flip.Solution s = new Flip().new Solution();
	
	@Test
	void test() {
		List lst = s.flip("010");
		assertEquals(1, lst.get(0));
		assertEquals(1, lst.get(1));
		
		lst = s.flip("111");
		assertEquals(0, lst.size());
		
		lst = s.flip("0110001");
		assertEquals(4, lst.get(0));
		assertEquals(6, lst.get(1));

		
		lst = s.flip("1101010001");
		assertEquals(3, lst.get(0));
		assertEquals(9, lst.get(1));
		
		lst = s.flip("0011101");
		assertEquals(1, lst.get(0));
		assertEquals(2, lst.get(1));

	}

}
