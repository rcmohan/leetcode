package com.crajas.fb.interview.bs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class RangeSearchTest {

	RangeSearch.Solution s = new RangeSearch().new Solution();
	
	
	@Test
	void test() {
		
		List<Integer> Q = Arrays.asList(5, 7, 7, 8, 8, 10, 12, 34, 43, 45, 76, 87, 89, 96);
		
		assertEquals(2, s.searchLast(Q, 7));
		assertEquals(1, s.searchFirst(Q, 7));
		assertEquals(0, s.searchFirst(Q, 5));
		assertEquals(0, s.searchLast(Q, 5));
		int L = Q.size() - 1;
		assertEquals(L, s.searchFirst(Q, Q.get(L)));
		assertEquals(L, s.searchLast(Q, Q.get(L)));
		
		Q = Arrays.asList(5, 7, 7, 8, 8, 10, 12, 34, 43, 45, 76, 87, 89, 96);
		
		
		
	}

}
