package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {

	static MedianOfTwoSortedArrays.Solution s = new MedianOfTwoSortedArrays(). new Solution();
	
	@Test
	void test() {
		assertEquals(2.0, s.findMedianSortedArrays(new int[] {1, 3}, new int[] {2}));
		assertEquals(2.5, s.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}));
		assertEquals(1.0, s.findMedianSortedArrays(new int[] {}, new int[] {1}));
		assertEquals(3.0, s.findMedianSortedArrays(new int[] {}, new int[] {1,2,3,4,5}));
		assertEquals(3.5, s.findMedianSortedArrays(new int[] {}, new int[] {1,2,3,4,5,6}));
		assertEquals(1.5, s.findMedianSortedArrays(new int[] {1, 2}, new int[] {-1,3}));
		assertEquals(2.0, s.findMedianSortedArrays(new int[] {1}, new int[] {2,3}));
	}
}
