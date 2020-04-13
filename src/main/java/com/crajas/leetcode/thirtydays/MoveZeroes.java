package com.crajas.leetcode.thirtydays;

import java.util.Arrays;

public class MoveZeroes {

	class Solution {
	    public void moveZeroes(int[] nums) {
	    	int j = 0;
	    	int i = 0;
	    	if(nums.length <= 1) {
	    		return;
	    	}
	    	while (j < nums.length) {
				while(j < nums.length && nums[j] == 0 ) {
					 j ++;
				}
				if(j < nums.length) {
					nums[i] = nums[j];
					j ++; i++;
				}
			}
	    	while(i < nums.length) {
	    		nums[i] = 0;
	    		i ++;
	    	}
	    }
	}
}
