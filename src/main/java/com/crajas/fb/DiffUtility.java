package com.crajas.fb;

import java.util.Arrays;

public class DiffUtility {

	public int diff(String s1, String s2) {
		int x = s1.length() + 1;
		int y = s2.length() + 1;
		int[][] dp = new int[x][y];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
				} else {
					int val = dp[i-1][j-1]; 
					if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
						dp[i][j] = val;
					} else {
						val = Math.min(dp[i-1][j], dp[i][j-1]);
						dp[i][j] = val + 1 ;
					}
				}
			}
			print(dp, s1, s2);
		}
		
		return dp[x-1][y-1];
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
