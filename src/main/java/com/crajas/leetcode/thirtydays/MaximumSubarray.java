package com.crajas.leetcode.thirtydays;

import java.util.Arrays;

public class MaximumSubarray {

	class Solution {
	    public int maxSubArray(int[] nums) {
	    	int maxsum = Integer.MIN_VALUE;
	    	int sum = 0;
	    	boolean start = false;
	    	int begin = 0;
            for(int i = 0; i < nums.length; ++i) {
            	int num = nums[i];
            	int newsum = start ? sum : sum + num;

            	System.out.println(String.format("A: %d, %d, %d, %s", nums[i], sum, newsum, substring(nums, begin, i)));
            	
            	if(newsum > sum) {
            		sum = newsum;
	                if(sum > maxsum) {
	                	maxsum = sum;
	                }
                } else {
                	while(newsum - nums[begin] > sum) {
                		newsum = newsum - nums[begin];
                		sum = newsum;
                    	if(sum > maxsum){
                    		maxsum = sum;
                    	}
                		begin ++;
                		System.out.println(String.format("B: %d, %s", sum, substring(nums, begin, i)));
                   	}  
                	if(begin == i){
                		sum = 0;
                	}
                }
            }
            return sum;
	    }
	    
	    
	}

	public String substring(int[] nums, int begin, int i) {
		StringBuffer s= new StringBuffer();
		while(begin < nums.length && begin <= i) {
			s.append(nums[begin]).append(",");
			begin ++;
		}
		return s.toString();
	}

}
