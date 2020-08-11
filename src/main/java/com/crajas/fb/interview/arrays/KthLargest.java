package com.crajas.fb.interview.arrays;

import java.util.Arrays;

public class KthLargest {
	
	public int kth (int[][] arrays, int k) {
		int res = 0;
//		print(arrays);
		int[] indices = new int[arrays.length];
		
		for (int i = 0; i < arrays.length; i++) {
			indices[i] = arrays[i].length - 1;
		}
		
		for(int i = 0; i < k; ++i) {
			int ndx = maxIndex(arrays, indices);
			res = arrays[ndx][indices[ndx]];
			indices[ndx] --;
//			System.out.println(Arrays.toString(indices));
		}
		
		return res;
	}

	private void print(int[][] arrays) {
		for (int i = 0; i < arrays.length; i++) {
//			System.out.println(Arrays.toString(arrays[i]));
		}
	}

	private int maxIndex(int[][] arrays, int[] indices) {
		int j = 0;
		int maxNdx = 0;
		int max = arrays[0][indices[0]];
		while (j < arrays.length) {
			if(indices[j] >= 0) {
				int val = arrays[j][indices[j]];
				if(max < val) {
					max = val;
					maxNdx = j;
//					System.out.println(max + ", " + maxNdx);
				}
			}
			j ++;
		}
		return maxNdx;
	}
	

}
