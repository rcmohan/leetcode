package com.crajas.leetcode.contests.contest179;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crajas.leetcode.contests.contest179.BulbSwitcher3.Solution;

class TimeNeededToInformAllEmployeesTest {

	private static int[] headIDs = {0, 2, 6, 0, 2, 0};
	
	private static int [][] manager = {
			{-1},
			{2,2,-1,2,2,2},
			{1,2,3,4,5,6,-1},
			{-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6},
			{3,3,-1,2},
			{-1,5,0,6,7,0,0,0}
	};
	private static int [][] inform_times = {
			{0},
			{0,0,1,0,0,0},
			{0,6,5,4,3,2,1},
			{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,162,914},
			{89,0,0,0,0,523,241,519}
	};
	private static int[] targets = {0, 1, 21, 3, 1076, 612};
	
	private TimeNeededToInformAllEmployees.Solution s = new TimeNeededToInformAllEmployees().new Solution();

	
	@Test
	void test() {
		int i = targets.length;
		while(i-->0) {
			assertEquals(targets[i], s.numOfMinutes(manager[i].length, headIDs[i], manager[i], inform_times[i]));
		}
	}

}
