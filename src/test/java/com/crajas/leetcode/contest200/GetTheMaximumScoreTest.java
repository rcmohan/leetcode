package com.crajas.leetcode.contest200;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class GetTheMaximumScoreTest {

	GetTheMaximumScore.Solution s = new GetTheMaximumScore().new Solution();
	
	int[][] T1 = {
			{2,4,5,8,10},
			{1,3,5,7,9},
			{1,2,3,4,5},
			{1,4,5,8,9,11,19},
	};
	
	int[][] T2 = {
			{4,6,8,9},
			{3,5,100},
			{6,7,8,9,10},
			{2,3,4,11,12}
	};
	
	int [] A = {
			30,
			109,
			40,
			61
	};
	
	
	@Test
	void test() {
		int j = A.length;
		while(j-- > 0) {
			assertEquals(A[j], s.maxSum(T1[j], T2[j]), "Failed for \n" + Arrays.toString(T1[j]) + " AND\n" + Arrays.toString(T2[j]));
		}
	}

}
