package com.crajas.leetcode;

public class FirstMissingPositive {

	class Solution {
	    public int firstMissingPositive(int[] nums) {
	    	int[] x = new int[nums.length];
	    	for(int num : nums) {
	    		if(num > 0 && num <= nums.length) {
	    			x[num - 1] = num;
	    		}
	    	}
	    	for(int i = 0; i < x.length; ++i) {
	    		if(x[i] == 0) return i+1;
	    	}
	    	return nums.length + 1;
	    }
	}
	
}
