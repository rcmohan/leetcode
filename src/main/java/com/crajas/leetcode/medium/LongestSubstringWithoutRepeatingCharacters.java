package com.crajas.leetcode.medium;


public class LongestSubstringWithoutRepeatingCharacters {
	class Solution {
		
		static final int BEG = 'a';

		
	    public int lengthOfLongestSubstring(String s) {
	    	if(s.length() == 0) return 0;
	        int[] pos = new int[128];
	        int max = 0;
	        int len = 0;
	        
	        for (int i = 0; i < s.length(); i++) {
				int p = s.charAt(i);
				
				int j = i + 1;
				int x = pos[p];
				len = Math.min(len + 1,  j - x);
				if(max < len) max = len;
				pos[p] = j; 
//				System.out.println(s.charAt(i) + ": " + p + ", " + x + " == " + len);
			}
	        return max;
	    }
	}
}
