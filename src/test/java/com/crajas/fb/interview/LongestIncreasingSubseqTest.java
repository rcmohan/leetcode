package com.crajas.fb.interview;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LongestIncreasingSubseqTest {

	private LongestIncreasingSubseq.Solution s = new LongestIncreasingSubseq().new Solution();
	
	@Test
	void test() {
		assertEquals(3, s.lis(Arrays.asList(3,2,6,4,5,1)));
		assertEquals(15, s.lis(Arrays.asList(69, 54, 19, 51, 16, 54, 64, 89, 72, 40, 31, 43, 1, 11, 82, 65, 75, 67, 25, 98, 31, 77, 55, 88, 85, 76, 35, 101, 44, 74, 29, 94, 72, 39, 20, 24, 23, 66, 16, 95, 5, 17, 54, 89, 93, 10, 7, 88, 68, 10, 11, 22, 25, 50, 18, 59, 79, 87, 7, 49, 26, 96, 27, 19, 67, 35, 50, 10, 6, 48, 38, 28, 66, 94, 60, 27, 76, 4, 43, 66, 14, 8, 78, 72, 21, 56, 34, 90, 89)));
	}

}
