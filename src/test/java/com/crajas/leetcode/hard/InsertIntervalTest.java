package com.crajas.leetcode.hard;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

class InsertIntervalTest {

	InsertInterval.Solution s = new InsertInterval().new Solution();
	
	int[][][] QS = {
			{{1,3},{6,9}},
			{{1,2},{3,5},{6,7},{8,10},{12,16}},
			{{3,5},{6,7},{8,10}},
			{{3,5},{6,7},{8,10}},
			{{3,5},{6,7},{8,10}},
			{{3,5},{6,7},{8,10}},
			{{}},
			null

	};
	
	int [][] INTS = {
			{2,5},
			{4,8},
			{1,2},
			{4,9},
			{7,12},
			{2,12},
			{5,7},
			{5,7}
	};

	int[][][] AS = {
			{{1,5},{6,9}},
			{{1,2},{3,10},{12,16}},
			{{1,2},{3,5},{6,7},{8,10}},
			{{3,10}},
			{{3,5},{6,12}},
			{{2,12}},
			{{5,7}},
			{{5,7}}
	};
	
	@Test
	void test() {

		int j = AS.length;
		while(j -- > 0) {
			System.out.println("Inputs : ");
			System.out.println(arrprint(QS[j]));
			System.out.println(Arrays.toString(INTS[j]));
			assertTrue(arrcmp(AS[j], s.insert(QS[j], INTS[j])));
		}
		
	}

	private boolean arrcmp(int[][] is, int[][] insert) {
		System.out.println("Comparing ");
		System.out.println(arrprint(is));
		System.out.println(arrprint(insert));
		
		for (int i = 0; i < insert.length; i++) {
			if(insert[i].length != 2 || is[i].length != 2 ||
					insert[i][0] != is[i][0]  || insert[i][1] != is[i][1]
					) {
				return false;
			}
		}
		return true;
	}

	private String arrprint(int[][] insert) {
		StringBuffer s = new StringBuffer();
		s.append("{");
		if(insert != null && insert.length > 0) for(int[] j : insert) {
			s.append(Arrays.toString(j));
		}
		s.append("}");
		return s.toString();
	}

}
