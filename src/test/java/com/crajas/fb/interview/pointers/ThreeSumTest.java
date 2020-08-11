package com.crajas.fb.interview.pointers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ThreeSumTest {
	
	ThreeSum.Solution s = new ThreeSum().new Solution();

	Integer[][] ARRS = {
		//    0   1  2  3  4
			{-4, -1, 1, 2, 4},
			
			{-1, 2, 1, -4}
	};
	
	@Test
	void test() {
		ArrayList<Integer> list = null;
//		list = list(ARRS[0]);
//		assertEquals(1, s.findClosest(list, 1, 2, 3));
//		assertEquals(4, s.findClosest(list, 2, 2, 3));
//		
		list = list(ARRS[1]);
		assertEquals(2, s.threeSumClosest(list, 1));
	}

	private ArrayList<Integer> list(Integer[] is) {
		 ArrayList<Integer> al = new  ArrayList<Integer>();
		 al.addAll(Arrays.asList(is));
		 return al;
	}

}
