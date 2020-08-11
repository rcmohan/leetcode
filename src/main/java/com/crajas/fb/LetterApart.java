package com.crajas.fb;

public class LetterApart {

	boolean oneEditApart(String s1, String s2) {
		
		if(s1.equals(s2)) return true;
		int s1l = s1.length() - 1;
		int s2l = s2.length() - 1;

		if(s1.indexOf(s2) >= 0 || s2.indexOf(s1) >= 0) return s1l - s2l == 1 || s2l - s1l == 1; 
		
		int left = 0;
		int right = 0;
		
		
		int max = s1l > s2l ? s1l : s2l;
		max ++;

		/*
		 * 		abc		abdc
		 * 		abc		ac
		 * 		abc		adc
		 */
		boolean compared = true;
		while(left + right < max && compared) {
			
			compared = false;
			if(s1.charAt(left) == s2.charAt(left)) { left ++; compared = true; } 
			if(s1.charAt(s1l - right) == s2.charAt(s2l - right)) {right ++; compared = true; }
		}
		
//		System.out.println(String.format("l=%d - r=%d  : s1=%d, s2=%d, max=%d", left, right, s1l, s2l, max));
		return max == left + right + 1;
		
	}
}
