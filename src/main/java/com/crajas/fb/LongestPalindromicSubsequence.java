package com.crajas.fb;

public class LongestPalindromicSubsequence {

	public int findLPS(String s) {
		if(s.length() == 1) {
			return 1;
		}
		
		int i = 0; 
		int j = s.length() - 1;
		
		return findLPS(s, i, j);
		
	}

	private int findLPS(String s, int i, int j) {
		if(j <= i) {
			return 1;
		} else if(s.charAt(i) == s.charAt(j)) {
			return findLPS(s, i + 1, j - 1) + 2;
		} else {
			return Integer.max(findLPS(s, i + 1, j), findLPS(s, i, j - 1));
		}
	}
}
