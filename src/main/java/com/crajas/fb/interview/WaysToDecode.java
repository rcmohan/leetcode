package com.crajas.fb.interview;

public class WaysToDecode {

	public class Solution {
	    public int numDecodings(String A) {
	    	Long total = 1l;
	    	for (int i = 0; i < A.length(); i++) {
				char j = A.charAt(i);
				if(j == '1' || j == '2') {
					if(i < A.length() - 1 && A.charAt(i + 1) < '7') {
						total = total << 1;
						total = total % 10_000_007;
					}
				}
			}
	    	return total.intValue();
	    }
	}

}
