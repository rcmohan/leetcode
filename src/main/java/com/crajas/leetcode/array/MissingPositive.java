package com.crajas.leetcode.array;

import java.util.BitSet;

public class MissingPositive {
	class Solution {
	    public int firstMissingPositive(int[] nums) {
	        int n = 0;
	        int min = Integer.MAX_VALUE;
	        for (int i = 0; i < nums.length; i++) {
				if(min < nums[i]) {
					min = nums[i];
				}
				if(nums[i] > 0) {
					n ++;
				}
			}
	        if(min > 1) {
	        	min = 1;
	        } else {
	        	BitSet bs = new BitSet(n);
	        	for (int i = 0; i < nums.length; i++) {
					if(nums[i] > 0) {
						bs.set(nums[i]);
					}
				}
	        	min = bs.nextClearBit(0);
	        }
	        return min;
	    }
	}
}
