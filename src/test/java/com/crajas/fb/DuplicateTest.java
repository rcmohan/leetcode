package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DuplicateTest {

	Duplicate.Solution s = new Duplicate().new Solution();
	
	
	@Test
	void test() {
		System.out.println(s.repeatedNumber(Arrays.asList(3,4,1,4,1)));
	}

}
