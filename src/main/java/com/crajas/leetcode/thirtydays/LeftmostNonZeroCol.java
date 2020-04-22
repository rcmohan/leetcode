package com.crajas.leetcode.thirtydays;

import java.util.List;

public class LeftmostNonZeroCol {

	/**
	 * // This is the BinaryMatrix's API interface.
	 * // You should not implement it, or speculate about its implementation
	 */

	
	class Solution {
	    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
	        List<Integer> size = binaryMatrix.dimensions();
	        int x = size.get(0);
	        int y = size.get(1);
	        int col = -1;
	        int left = 0;
	        int right = y;
	        while(left <= right) {
		        int j = left + (right - left) / 2;
		        if(j < y && j >= 0) {
		        	if(checkColumn(binaryMatrix, j, x)) {
		        		col = j;
		        		right = j - 1;
		        	} else {
		        		left = j + 1;
		        	}
		        } else {
		        	break;
		        }

	        }
	        return col;
	    }

		private boolean checkColumn(BinaryMatrix binaryMatrix, int j, int x) {
        	for(int i = 0; i < x ; ++i) {
        		int k = binaryMatrix.get(i, j);
        		if (1 == k) {
        			return true;
        		}
        	}
        	return false;

		}
	}
}
