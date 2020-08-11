package com.crajas.fb.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class HotelBookingsTest {

	HotelBookings.Solution s = new HotelBookings().new Solution();

	Integer[][] ARRIVES = { 
				{ 1, 3, 5 }, 
				{ 1, 3, 5 },
				{40, 18},
				{ 35, 8, 23, 22, 35, 6, 48, 45, 33, 43, 37, 12, 42, 3, 31, 38, 5, 33, 15},
				{1, 2, 3, 4}
			};
	Integer[][] DEPARTS = { 
				{ 4, 6, 8 },
				{ 4, 6, 8 },
				{40, 43},
				{43, 32, 34, 46, 74, 50, 95, 62, 59, 79, 83, 19, 88, 34, 75, 42, 42, 50, 58},
				{10, 2, 6, 14}
			};
	Integer[] ROOMS = new Integer[]{
			1,
			2,
			1,
			11,
			4
			};

	Boolean [] ANS = {
			false,
			true, 
			true,
			true,
			true
	};
			
	
	@Test
	void test() {
		for (int j = 0; j < ARRIVES.length; j++) {
			assertEquals(ANS[j], s.hotel(toList(ARRIVES[j]), toList(DEPARTS[j]), ROOMS[j]));
		}
	}

	private ArrayList<Integer> toList(Integer[] integers) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < integers.length; i++) {
			ret.add(integers[i]);
		}
		return ret;
	}

}
