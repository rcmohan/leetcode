package com.crajas.fb.interview.bs;

import java.util.ArrayList;
import java.util.List;

public class RangeSearch {
	public class Solution {
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
	    	
	    	
	    	int l = searchFirst(A, B);
	    	int r = searchLast(A, B);
	    	
	    	ArrayList<Integer> lst = new ArrayList<Integer>();
	    	lst.add(l);
	    	lst.add(r);
	    	return lst;
	    }

	    public int searchFirst(List<Integer> a, int v) {
//			System.out.println();
//			System.out.println("Looking for first " + v + " in " + a);
	    	
	    	int l = 0;
	    	int r = a.size() - 1;
	    	while(l < r) {
	    		int m = l + (r - l) / 2;
//	    		System.out.println(String.format("%d, %d, %d", l, m, r));
	    		if(a.get(m) >= v) {
	    			r = m ;
	    		} else {
	    			l = m + 1;
	    		}
	    	}
//			System.out.println(String.format("%d, %d", l, r));
	    	
	    	if(a.get(l) == v) {
	    		return l;
	    	} else {
	    		return -1;
	    	}
	    	
		}

		public int searchLast(List<Integer> a, int v) {
			
//			System.out.println();
//			System.out.println("Looking for last " + v + " in " + a);
			int l = 0;
			int r = a.size() - 1;
			while(l < r) {
				int m = (l + r + 1) / 2;
//				System.out.println(String.format("%d, %d, %d : %d, %d", l, m, r, a.get(m), v));
				if(a.get(m) > v) {
					r = m - 1;
				} else {
					l = m;
				}
				
			}
//			System.out.println(a);
//			System.out.println(String.format("F: %d, %d", l, r));
			if(a.get(l) == v) {
				return l;
			} else {
				return -1;
			}
			
		}
	}

}
