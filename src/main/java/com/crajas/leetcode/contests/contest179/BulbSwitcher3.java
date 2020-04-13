package com.crajas.leetcode.contests.contest179;

public class BulbSwitcher3 {

	class Solution {
		public int numTimesAllBlue(int[] light) {
			long sum = 0;
			long k = 0;
			int count = 0;
			for (int i = 0; i < light.length; i++) {
				sum += light[i];
				k += (i+1);
				if (k == sum) {
					count++;
		    		System.out.println(String.format("light[%d]=%s, %s, {%d, %d, %d}", i, light[i], count, i+1, sum, k));
				}
			}
			return count;
		}
	}
}
