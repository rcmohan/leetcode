package com.crajas.fb;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LevenshteinDistance {

	public int levDist(String s1, String s2) {
		if(s1.length() < s2.length()) {
			String s = s2;
			s2 = s1;
			s1 = s;
		}
		int x = s1.length() + 1;
		int y = s2.length() + 1;
		
//		int diff = 0;
//		
//		for(int i = 0; i < y; ++i) {
//			if(s1.charAt(i) != s2.charAt(i)) {
//				diff ++;
//			}
//		}
//		for(int i = y; i < x; ++i) {
//			diff ++;
//		}
//		
//		return diff;
		
		int[][] dp = new int[x][y];
		
		for(int i = 0; i < x; ++i) {
			for(int j = 0; j < y; ++j) {
				if(i > 0 && j > 0) {
					if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
						dp[i][j] = dp[i-1][j-1];
					} else {
						dp[i][j] = min(dp[i][j-1], dp[i-1][j-1], dp[i-1][j]) + 1;
					}
				} else {
					dp[i][j] = Integer.max(i, j);
				}
			}
			System.out.println();
			print(dp, s1, s2);
		}
//		for(int i = y; i < x; ++i) {
//			dp[i][y-1] = dp[i-1][y-1] + 1;
//			print(dp, s1, s2);
//		}
		return dp[x-1][y-1];
	}
	
	protected int min(int... x) {
		int min = x[0];
		for (int i = 1; i < x.length; i++) {
			if(min > x[i]) min = x[i];
		}
		return min;
	}

	private void print(int[][] lrs, String s1, String s2) {
		System.out.print("[   ");
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(" " + s2.charAt(i) + ",");
		}
		System.out.println();
		System.out.println(" " + Arrays.toString(lrs[0]));
		for (int i = 1; i < lrs.length; i++) {
			System.out.println(s1.charAt(i - 1) + Arrays.toString(lrs[i]));
		}
		System.out.println("]");
	}
}
