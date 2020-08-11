package com.crajas.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LongestPalindromicSubstring {

	class Solution {
		
	    public String longestPalindrome(String s) {
	    	int n = s.length()-1;
	    	int max = 0;
	    	int pos = 0;
	    	String ret = "";
	    	for(int i = n -1; i >= 2; i--) {
	    		int pali = 0;
	    		int l = i - 1; int r = i + 1;
	    		boolean isValid = false;
	    		if(s.charAt(l) == s.charAt(r)) {
    				isValid = true;
    				pali = 1;
	    		} else {
	    			if(s.charAt(l) == s.charAt(i)) {
	    				System.out.println("even");
	    				r = i;
	    				isValid = true;
	    			} else if(s.charAt(i) == s.charAt(r)) {
	    				System.out.println("even");
	    				l = i;
	    				isValid = true;
	    			}
	    		}
    			System.out.printf("i = %d, j = %d, n = %d, %s = %s, %s\n", i, l, r, s.substring(l, r + 1), s.charAt(l), s.charAt(r));
    			while(isValid && l >= 0 && r <= n && s.charAt(l) == s.charAt(r)) {
	    			System.out.printf("i = %d, j = %d, n = %d, %s = %s, %s\n", i, l, r, s.substring(l, r + 1), s.charAt(l), s.charAt(r));
	    			pali += 2;
	    			if(max < pali) {
	    				max = pali;
	    				pos = i;
	    			}
	    			l --; r ++;
	    		}

	    	}
	    	if(max > 2) { 
	    		max = max >> 1;
	    		ret = s.substring(pos - max, pos + max + 1);
	    	}
	    	System.out.println("____" + ret + "____");
    		return ret;
	    }
	    
		class Pair { int l, r; Pair(int x, int y) { this.l = x; this.r = y; }}
	    
	    public String str(String s) {
	    	
	    	Queue<Pair> q = new LinkedList<Pair> ();
	    	Pair p = new Pair(0, s.length());
	    	q.add(p);
	        return check(s, q);
	    }
	    
	    private String check(String s, Queue<Pair> q) {
			while(q.size() > 0) {
				Pair p = q.remove();
				if(p.r - p.l >= 3 && isPali(s, p)) {
					return s.substring(p.l, p.r);
				} else {
					q.add(new Pair(p.l+1, p.r));
					q.add(new Pair(p.l, p.r - 1));
				}
			}
			return null;

		}

	    boolean isPali(String substring, Pair p) {
			return isPali(substring.substring(p.l, p.r));
		}

		public boolean isPali(String substring) {
			int l = substring.length() - 1;
			for(int i = 0; i <= substring.length() / 2; ++i, l--) {
				if(substring.charAt(i) != substring.charAt(l)) {
					System.out.println(substring + " is not a pali");
					return false;
				}
			}
			System.out.println(substring + " is a pali!");
			return true;
		}
	}
}
