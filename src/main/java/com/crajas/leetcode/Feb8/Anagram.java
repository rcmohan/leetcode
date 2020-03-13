package com.crajas.leetcode.Feb8;

import java.util.Arrays;

public class Anagram {
	class Solution {
		
		
	    public int minSteps(String s, String t) {
	     int[] count1 = new int[26];
	    	
	     for(int i = 0; i < s.length(); ++i) {
	    	 count1[Character.getNumericValue(s.charAt(i)) - 10]++;
	     }
	     int sum = 0;
	     for(int i = 0; i < s.length(); ++i) {
	    	 int j = Character.getNumericValue(t.charAt(i)) - 10;
			if(count1[j] == 0) sum ++;
	    	 else count1[j]--;
	     }
	     return sum;   
	    }
	}
}
