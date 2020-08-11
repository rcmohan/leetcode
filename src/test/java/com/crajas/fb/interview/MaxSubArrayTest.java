package com.crajas.fb.interview;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaxSubArrayTest {

	MaxSubArray.Solution s = new MaxSubArray().new Solution();
	
	@Test
	void test() {
		System.out.println(s.maxSubArray(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4)));
	}

}
