package com.crajas.leetcode.contests.contest179;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BulbSwitcher3Test {

	private static int [][] nums = {
			{2,1,3,5,4},
			{3,2,4,1,5},
			{4,1,2,3},
			{2,1,4,3,6,5},
			{1,2,3,4,5,6},
			{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,100,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,58}
	};
	private static int[] targets = {3, 2, 1, 3, 6, 58};
	
	private BulbSwitcher3.Solution s = new BulbSwitcher3().new Solution();
	
	@Test
	void test() {
		for(int i = 0; i < targets.length; ++i) {
			assertEquals(targets[i], s.numTimesAllBlue(nums[i]));
		}
	}

}
