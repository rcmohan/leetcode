package com.crajas.fb.interview.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class KthLargestUnsortedTest {

	KthLargestUnsorted t = new KthLargestUnsorted();
	
	Integer[][] TESTS = {
			{1, 2, 3, 4, 5, 6, 7},
			{33, 45, 12, 34, 58, 97, 21, 34, 89, 27, 34, 49},
			{33, 45, 12, 34, 58, 97, 21, 34, 89, 27, 34, 49, 100, 101, 102, 103}
	};
	
	int[] KS = {
			4, 
			4,
			8
	};
	
	int [] ANS = {
		4,
		49,
		49
	};
	
	@Test
	void test() {
		int j = TESTS.length;
		while(j -- > 0) {
			assertEquals(ANS[j], t.kth(Arrays.asList(TESTS[j]), KS[j]));
		}
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10000; i ++) list.add(i);
		Collections.shuffle(list);
		
		assertEquals(9994, t.kth(list, 6));
		
	}

}
