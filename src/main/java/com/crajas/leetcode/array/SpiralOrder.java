package com.crajas.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	class Solution {
		
	    public List<Integer> spiralOrder(int[][] matrix) {
	    	int t = -1;
	    	int b = matrix.length;
	    	int l = -1;
	    	int r = matrix[0].length;
	    	
	    	List<Integer> ret = new ArrayList<>();
	    	
	    	int i = 0; int j = 0;
	    	int direction = 0;
	    	System.out.println("K from 0 to " + b*r);
	    	int tot = b * r;
	    	for (int k = 0; k < tot; k++) {
				ret.add(matrix[i][j]);
				switch(direction) {
				case 0: j++; if (j >= r) {  direction = 1; j--; t++; i ++; } break;
				case 1: i++; if (i >= b) {  direction = 2; i --; r --; j --;} break;
				case 2: j--; if (j <= l) {  direction = 3; j ++; b --;; i --;} break;
				case 3: i--; if (i <= t) {  direction = 0; i ++; l ++; j ++;} break;
				}
			}
	    	return ret;
	    }
	}
}
