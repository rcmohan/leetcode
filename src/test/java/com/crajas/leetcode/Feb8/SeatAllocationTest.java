package com.crajas.leetcode.Feb8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeatAllocationTest {

	char[][] seats1 = {{'#','.','#','#','.','#'},
	                     {'.','#','#','#','#','.'},
	                     {'#','.','#','#','.','#'}};
	
	SeatAllocation.Solution s = new SeatAllocation().new Solution();
	
	@Test
	void test() {
		assertEquals(4, s.maxStudents(seats1));
	}

}
