package com.crajas.leetcode.thirtydays;

import java.util.Arrays;

public class LargestSubarray {

	class Solution {
	    public int maxSubArray(int[] nums) {
	    	int sum = 0;
	    	int maxSum = Integer.MIN_VALUE;
	    	int lastindex = 0;
	    	for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
				System.out.println(String.format("%d! {%d}, [%d-%d] %s", maxSum, sum, lastindex, i, Arrays.toString(Arrays.copyOfRange(nums, lastindex, i+1))));
				if(sum > maxSum) {
						maxSum = sum;
				} else {
					System.out.println(String.format("can we drop the last number? %d > %d?", nums[i], nums[lastindex]));
					if(nums[i] > nums[lastindex]) {
						System.out.println(String.format("%d! rearranging %d, [%d-%d] %s", maxSum, sum, lastindex, i, Arrays.toString(Arrays.copyOfRange(nums, lastindex, i+1))));
						sum -= nums[lastindex];
						lastindex ++;
						System.out.println(String.format("%d! rearranged  %d, [%d-%d] %s", maxSum, sum, lastindex, i, Arrays.toString(Arrays.copyOfRange(nums, lastindex, i+1))));
					} else {
						if(sum > maxSum) {
							maxSum = sum;
						} else {
							sum = 0;
						}
						System.out.println("Adjust failed");
						lastindex = i;
						System.out.println(String.format("%d! rearranged  %d, [%d-%d] %s", maxSum, sum, lastindex, i, Arrays.toString(Arrays.copyOfRange(nums, lastindex, i+1))));
						sum = nums[i];
						
					}
				}
			}
	    	return maxSum;
	    }
	}
}
