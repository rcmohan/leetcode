package com.crajas.fb.interview.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class RearrangeArrayTest {
	
	RearrangeArray.Solution s = new RearrangeArray().new Solution();

	@Test
	void test() {
		run(Arrays.asList(1, 1, 1));
		run(Arrays.asList(1, 0));
		run(Arrays.asList(1, 0, 2, 3));
		run(Arrays.asList(3, 3, 3, 3));
		run(Arrays.asList(4, 0, 2, 1, 3));
		
	}

	private void run(List<Integer> list) {
		ArrayList<Integer> t = new ArrayList<>();
		t.addAll(list);
		s.arrange(t);
		System.out.println(t);
	}

}
