package com.crajas.fb;

import java.util.Arrays;

public class LongestRepeatedSubsequence {

	
	public int findLRS(String s1, String s2) {
		int[][] LRS = new int[s1.length() + 1][s2.length() + 1];
		int max = solve(s1, s2, LRS);
		return max;
	}

	private int solve(String s1, String s2, int[][] LRS) {
		int max = 0;
		for (int i = 1; i <= s1.length(); i++) {
			int loopmax = 0;
			for (int j = 1; j <= i && j <= s2.length(); j++) {
				int x = i - 1;
				int y = j - 1;
				int val = Integer.max(LRS[i - 1][j], LRS[i][j-1]);
				if(s1.charAt(x) == s2.charAt(y)) {
					val++;
					System.out.print(s1.charAt(x) + "==" + s2.charAt(y) + "-" + val + ", ");
				} else {
					System.out.print(s1.charAt(x) + "!=" + s2.charAt(y) + ", ");
				}
				if(val > max) max = val;
				if(val > loopmax) loopmax = val;
				LRS[i][j] = val;
			}
			for (int j = i+1; j <= s2.length(); j++) {
				LRS[i][j] = loopmax;
			}
			System.out.println();
			print(LRS, s1, s2);
		}
		return max;
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
