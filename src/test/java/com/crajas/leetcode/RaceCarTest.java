package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RaceCarTest {

	RaceCar.Solution s = new RaceCar().new Solution();

	@Test
	void test() {
		
//		this.racecar(5617);
		int target = 0;
		
		target = 812;
		assertEquals(this.racecar(target), s.racecar(target));
		target = 5;
		assertEquals(this.racecar(target), s.racecar(target));
		target = 511;
		assertEquals(this.racecar(target), s.racecar(target));
//		
//		String s = "AAARRAA";
//				
//		System.out.printf("Pos of '%s': %d\n", s, this.pos(s, true));
		
//		System.out.println(this.pos("AAAAAAAAARRAAAAAAAARRAAAAARRR", true));
		
	}

	public int racecar(int target) {
		
		int pos = 0;
		int steps = 0;

		List<String> q = new ArrayList<String>();
		boolean found = false;
		String s = "";
		while (pos(s + "A", false) < target) {
			s = s + "A";
		}
		q.add(s);
		while (!found) {
			q = populateQ(q);
			System.out.println(q.size());
			for (String s1 : q) {
				if (pos(s1, false) == target) {
					System.out.println(Integer.toBinaryString(target));
					System.out.println(s1);
					System.out.println(pos(s1, true));
					return s1.length();
				}
			}
		}
		return steps;
	}

	List<String> populateQ(List<String> ss) {
		List<String> r = new ArrayList<String>();
		for (String s : ss) {
			r.add(s + "A");
			if(!s.endsWith("RR")) r.add(s + "R");
		}
		return r;
	}

	public int pos(String s, boolean debug) {
		int pos = 0;
		int speed = 1;
		for (char c : s.toCharArray()) {
			switch (c) {
			case 'A':
				pos += speed;
				speed *= 2;
				break;
			case 'R':
				if (speed > 0) {
					speed = -1;
				} else {
					speed = 1;
				}
			}
			if(debug) System.out.print("[" + pos + "(" + speed + ")]->");
		}
		if(debug)System.out.println();
		return pos;
	}

}
