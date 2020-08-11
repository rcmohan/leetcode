package com.crajas.fb.interview.pointers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

class TwoArrayIntersectionTest {
	
	TwoArrayIntersection.Solution s = new TwoArrayIntersection().new Solution();

	Integer TESTS[][][] = {
			{
				{1,2,3,3,4,5,6},
				{3,3,5}
			},
			{
				{1,2,3,3,4,5,6},
				{3,5}
			}
	};
	
	Integer OUTPUT [][] = {
			{3, 3, 5},
			{3, 5}
	};

	
	@Test
	void test() {
		int j = OUTPUT.length;
		while(j -- > 0) {
			
			ArrayList<Integer> l = new ArrayList<>();
			ArrayList<Integer> r = new ArrayList<>();
			l.addAll(Arrays.asList(TESTS[j][0]));
			r.addAll(Arrays.asList(TESTS[j][1]));
			
			assertTrue(equal(Arrays.asList(OUTPUT[j]), s.intersect(l, r)));
		}
	}


	private Boolean equal(List<Integer> asList, ArrayList<Integer> intersect) {
		System.out.println("Comaparing\n" + asList + "and \n" + intersect);
		int l = asList.size();
		boolean eq = true;
		if(l == intersect.size()) {
			while(l -- > 0) {
				if(asList.get(l) != intersect.get(l)) {
					eq = false;
					break;
				}
			}
		} else {
			eq = false;
		}
		return eq;
		
	}

}
