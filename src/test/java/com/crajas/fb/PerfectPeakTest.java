package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PerfectPeakTest {
	
	PerfectPeak.Solution s = new PerfectPeak().new Solution();

	@Test
	void test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(5, 1, 4, 3, 6, 8, 10, 7, 9));
		assertEquals(1, s.perfectPeak(a));
		a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(5, 1, 4, 4));
		assertEquals(0, s.perfectPeak(a));
		a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(5706, 26963, 24465, 29359, 16828, 26501, 28146, 18468, 9962, 2996, 492, 11479, 23282, 19170, 15725, 6335));
		assertEquals(0, s.perfectPeak(a));
		a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(10549, 15882, 24856, 301, 16642, 14414, 19856));
		assertEquals(0, s.perfectPeak(a));
		a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(9895, 30334, 17674, 23812, 20038, 25668, 6869, 1870, 4665, 27645, 7712, 17036, 31323, 8724, 28254, 28704, 26300, 25548, 15142, 12860, 19913, 32663, 32758));
		assertEquals(1, s.perfectPeak(a));
	}

}
