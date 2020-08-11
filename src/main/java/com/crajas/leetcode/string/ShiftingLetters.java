package com.crajas.leetcode.string;

import java.util.Arrays;

public class ShiftingLetters {

	class Solution {
	    public String shiftingLetters(String S, int[] shifts) {
	    	int i = shifts.length;
	    	int[] counts = new int[i];
	    	i --;
	    	counts[i] = shifts[i];
//    		System.out.printf("%d: %d = %d\n", i, shifts[i], counts[i]);
	    	
	    	while(i-- > 0) {
	    		counts[i] = (counts[i+1] + shifts[i]) % 26;
//	    		System.out.printf("%d: %d * %d = %d\n", i, counts[i+1], shifts[i], counts[i]);
	    	}
	    	
//	    	System.out.println(Arrays.toString(counts));
	    	
	    	StringBuffer s = new StringBuffer();
	    	
	    	for(int j = 0; j < S.length(); ++j) {
	    		s.append(shift(S.charAt(j), counts[j]));
	    	}
	    	return s.toString();
	    }

		public char shift(char charAt, int i) {
			int x = charAt - 'a';
			x = (x + i) % 26;
			return (char) ('a' + x);
			
		}
	}
}
