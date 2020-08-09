package com.crajas.leetcode.contests.contest201;

public class KthBitNthBinary {

	class Solution {
	    public char findKthBit(int n, int k) {
	        StringBuffer s1 = new StringBuffer("0");
	        for(int i = 0; i < n; ++i) {
		        StringBuffer si = new StringBuffer(s1);
	        	si = caseFlip(si);
		        si = si.reverse();
	        	s1.append("1");
	        	s1.append(si);
	        }
	        return s1.charAt(k - 1);
	    }

		private StringBuffer caseFlip(StringBuffer s1) {
			StringBuffer s2 = new StringBuffer();
			for (int i = 0; i < s1.length(); i++) {
				s2.append(s1.charAt(i) == '0' ? '1' : '0');
			}
			return s2;
		}
	}
}
