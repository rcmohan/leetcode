package com.crajas.leetcode.math;

public class PowerOfFour {
	class Solution {
	    public boolean isPowerOfFour(int num) {
			int j = num & -num;
			int k = num & 0xAAAAAAAA;  
		
			return num == j && num != k;
	    }
	}
}
