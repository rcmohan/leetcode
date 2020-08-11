package com.crajas.leetcode.hard;

import java.util.Arrays;
import java.util.BitSet;

public class MaximumGap {
	class Solution {
		
	    public int maximumGap(int[] nums) {
	    	if(nums.length < 2) {
	    		return 0;
	    	}
	    	Arrays.sort(nums);
	    	
	    	int max = Integer.MIN_VALUE;
	    	for(int i = 1; i < nums.length; ++i) {
	    		int t = nums[i] - nums[i - 1];
	    		if(max < t) max = t;
	    	}

	    	return max;
	    	
	    }
		
	    public int maximumGap2(int[] nums) {
	 
	    	BitSet bs = new BitSet();
	    	int min = Integer.MAX_VALUE;
	    	int c = 0;
	    	for(int n : nums) {
	    		if (min > n) min = n;
	    		 c ++;
	    	}
	    	
	    	for(int n : nums) {
	    		bs.set(n - min);
	    	}
	    	

	    	int diff = 0;

	    	for (int i = bs.nextSetBit(0); i >= 0 && c > 0; i = bs.nextSetBit(i+1)) {
	    	     
	    		int n = bs.nextSetBit(i);
	    		int t = n - min;
//	    		System.out.println(n + "-" + t + ": min = " + min + " diff = " + diff);
	    		if(t > diff) diff = t;
	    		c --;
	    		min = n;
	    	}
	    	
	    	return diff;
	    }
	}
}
