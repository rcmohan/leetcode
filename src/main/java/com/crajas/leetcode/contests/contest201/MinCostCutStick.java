package com.crajas.leetcode.contests.contest201;

import java.util.Arrays;

public class MinCostCutStick {
	class Solution {
	    public int minCost(int n, int[] cuts) {
	        int[] r = new int[cuts.length + 1];
	        r[0] = 0;
	        for (int i = 1; i <= r.length; i++) {
				int q = Integer.MIN_VALUE;
				System.out.println(Arrays.toString(r));
				for(int j = 1; j < i; ++j) {
					System.out.println(q + "," + i + "," + j + ",r[" + (i-j) + "]");
					System.out.println(r[i-j]);
					q = Integer.max(q, profit(cuts[i], r[i-j-1]));
					r[j] = q;
				}
			}
	        System.out.println(Arrays.toString(r));
	        return r[r.length - 1];
	    }

		private int profit(int i, int j) {
			return 0;
		}
	}
}
