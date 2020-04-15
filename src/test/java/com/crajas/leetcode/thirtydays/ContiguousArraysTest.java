package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class ContiguousArraysTest {

	ContiguousArrays.Solution s = new ContiguousArrays().new Solution();
	
	@Test
	void test() {
		assertEquals(2, s.findMaxLength(new int[] {0, 1, 0}));
		assertEquals(2, s.findMaxLength(new int[] {0, 1}));
		assertEquals(10, s.findMaxLength(new int[] {1,0,1,0,0,1,0,1,0,1}));
		assertEquals(10, s.findMaxLength(new int[] {1,0,1,0,0,1,0,1,0,1,1,1,1,1,1,0}));
		assertEquals(12, s.findMaxLength(new int[] {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}));
		}
	
	void x(){
		int [] x = {1, 3, 21, 543,12,1233423, 3, 5};
		List<Integer> ar = new ArrayList<>();
		int l = x.length;
		while(l-- > 0) {
			ar.add(x[l]);
		}
		
		System.out.println(ar.parallelStream().max(Comparator.comparing(Integer::valueOf)).get());

	}

}
