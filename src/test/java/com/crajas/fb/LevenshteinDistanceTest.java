package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LevenshteinDistanceTest {

	private LevenshteinDistance ld = new LevenshteinDistance();
	
	@Test
	void test() {
		assertEquals(0, ld.min(0, 1, 2, 3));
		assertEquals(3, ld.levDist("sitting", "kitten"));
	}

}
