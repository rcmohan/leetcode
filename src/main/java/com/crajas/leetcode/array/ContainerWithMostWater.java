package com.crajas.leetcode.array;

public class ContainerWithMostWater {
	class Solution {
		public int maxArea(int[] height) {
			int max = 0;
	        if(height == null || height.length <= 1) return 0;
	        int n = height.length;
			for (int i = 0; i < n; i++) {
				int k = 1;
				int l = height[i];
				for(int j = i + 1; j < n; ++j, k++) {
					int v = Math.min(l, height[j]) * k;
					if(max < v) max = v;
				}
			}
			return max;
	    }
	}
}
