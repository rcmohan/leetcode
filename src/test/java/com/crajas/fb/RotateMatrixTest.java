package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RotateMatrixTest {
	
	RotateMatrix.Solution rm = new RotateMatrix().new Solution();

	final int AL[][][] = {
			{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			}
	};
	
	@Test
	void test() {
		int i = 0;
		
		
		ArrayList<ArrayList<Integer>> a =		get(AL[i]);

		rm.rotate(a);
		System.out.println(a);
	}

	private ArrayList<ArrayList<Integer>> get(int[][] is) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < is.length; i++) {
			al.add(new ArrayList<Integer>());
			for (int j = 0; j < is.length; j++) {
				al.get(i).add(is[i][j]);
			}
		}
		return al;
		
	}

}
