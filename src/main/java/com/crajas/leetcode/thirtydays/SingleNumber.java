package com.crajas.leetcode.thirtydays;

public class SingleNumber {
	class Solution {
	    public int singleNumber(int[] nums) {
	    	int single = 0;
	    	for(int num : nums) {
	    		single ^= num;
	    	}
	    	return single;
	    }
	}
}
