package com.crajas.leetcode.thirtydays;

public class JumpGame {

	class Solution {
	    public boolean canJump(int[] nums) {
	    	for(int i = 0; i < nums.length; ++i) {
	    		nums[i] += i;
	    	}
	    	
	    	int j = nums.length;
	    	while(j -- > 0) {
    			System.out.println((nums.length - 1) + " ?= " + nums[j]);
	    		if(nums[j] == nums.length - 1) {
	    			System.out.println(j + ", " + nums[j] + " is " + check(nums, j));
	    			if(check(nums, j)) return true;
	    		}
	    	}
	    	return false;
	    }

		public boolean check(int[] nums, int j) {
			int i = j;
			while(i >= 0) {
				if(nums[i] == j) {
					System.out.println("Jump from " + i + " to " + nums[i]);
					j = i;
				} 
				i--;
				System.out.println(i);
			}
			System.out.println("Finally " + j);
			return j == 0;
		}
	}
}
