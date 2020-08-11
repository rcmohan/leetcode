package com.crajas.fb;

import java.util.Arrays;

public class KnapSack {

	public int solve(int[] w, int[] v, int target) {
		int dp[] = new int[target + 1];
		dp[0] = 0;
		for(int i = 1; i <= target; ++i) {
			int max = 0;
			int j = 0;
			while(j < w.length && w[j] <= i) {
				int x = i-w[j];
				int t = v[j] + dp[x];
				if(max < t) {
					max = t;
				}
				j ++;
			}
			dp[i] = max;
			System.out.println(Arrays.toString(dp));
		}
		return dp[target];
	}

}
