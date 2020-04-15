package com.crajas.leetcode.thirtydays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ContiguousArrays {
	class Solution {
		class MinMax{
			int min, max;
			public MinMax(int a, int b) {min = a; max = b;}
			@Override public String toString() { return String.format("%s:%s", min, max); }
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
	    public int findMaxLength(int[] nums) {
	    	int n = nums.length;
	    	int ones = 0;
	    	int t1 = 0;
	    	int t0 = 0;
	    	int max = 0;
	    	map.put(0, nums.length);
			while(n-- > 0) {
	    		if (nums[n] == 0) {
	    			ones --;  t0++;
	    		} else {
	    			ones ++; t1++;
	    		}
	    		Integer x = map.get(ones);
	    		if(x == null) {
	    			map.put(ones, n);
	    		} else {
	    			if(x - n > max) max = x -n;
	    		}
	    	}
			if(t0 == t1) {
				return t0 + t1;
			}
			
			return max;
		}
	}
	    
}
