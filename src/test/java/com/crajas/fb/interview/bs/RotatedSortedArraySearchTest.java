package com.crajas.fb.interview.bs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RotatedSortedArraySearchTest {

	static RotatedSortedArraySearch.Solution s = new RotatedSortedArraySearch().new Solution();
	static ArrayList<Integer> AL = new ArrayList<>();
	static ArrayList<Integer> BL = new ArrayList<>();
	static ArrayList<Integer> CL = new ArrayList<>();

	@BeforeAll
	static void init(){
		AL.addAll(Arrays.asList(4, 5, 6, 7, 8, 9, 0, 1, 2, 3));
		BL.addAll(Arrays.asList(6, 7, 8, 9, 0, 1, 2, 3, 4, 5));
		CL.addAll(Arrays.asList(101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100));
	}

	@Test
	void test() {
		assertEquals(5, s.findPivot(AL));
		assertEquals(3, s.findPivot(BL));
		assertEquals(9, s.findPivot(CL));
	}

	@Test
	void test2() {

		assertEquals(7, s.search(AL, 1));
		assertEquals(5, s.search(BL, 1));
		assertEquals(-1, s.search(BL, 11));

		assertEquals(8, s.search(CL, 202));

	}

}
