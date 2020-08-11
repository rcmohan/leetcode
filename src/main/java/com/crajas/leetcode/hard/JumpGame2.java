package com.crajas.leetcode.hard;

import java.util.Arrays;

public class JumpGame2 {

	class Solution {
	    public int jump(int[] nums) {
	        int dp[] = new int[nums.length];
	        int jumps[] = new int[nums.length];
	        int k = 0;
	        int p = 1;
	        jumps[0] = 0;
	        for (int i = 0; i < nums.length; i++) {
				int to = k + nums[i];
				while(p <= to && p < nums.length) {
					dp[p] = k;
					jumps[p] = jumps[i] + 1;
					p ++;
				}
				k ++;
			}
	        System.out.println(Arrays.toString(dp));
	        System.out.println(Arrays.toString(jumps));
	        return jumps[jumps.length - 1];
	    }
	    
	}
}
