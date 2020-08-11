package com.crajas.fb.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestHistogramAreaTest {

	LargestHistogramArea lha = new LargestHistogramArea();
	
	@Test
	void test() {
		
		System.out.println(lha.largestArea(new Integer[]{6,2,5,4,5,1,6}));
	}

}
