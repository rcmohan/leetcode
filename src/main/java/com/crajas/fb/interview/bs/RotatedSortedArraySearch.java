package com.crajas.fb.interview.bs;

import java.util.List;

public class RotatedSortedArraySearch {

	public class Solution {
		
		/*
		 * [6, 7, 8, 9, 0, 1, 2, 3, 4, 5]
		 */
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public int search(final List<Integer> A, int B) {
	    	
	    	
	    	int ret = findPivot(A);
	    	int val = A.get(ret);
	    	if(B < val) {
	    		int left = 0;
	    		int right = 0;
	    		if(B > A.get(0)) {
	    			left = 0;
	    			right = ret - 1;
	    		} else {
	    			left = ret + 1;
	    			right = A.size() - 1;
	    		}
	    		System.out.println("Searching " + B + " in " + left + "-" + right + ": "+ A.subList(left, right));
	    		while(left < right) {
		    		int mid = (left + right + 1) / 2;
		    		val = A.get(mid);
		    		System.out.println(String.format("[%d]=%d, [%d]=%d, [%d]=%d", left, A.get(left), right, A.get(right), mid, A.get(mid)));
		    		if(val > B) {
		    			right = mid - 1;
		    		} else {
		    			left = mid;
		    		}
	    		}
	    		ret = A.get(left) == B ? left : -1;
	    	} else {
	    		ret = -1;
	    	}
	    	
	    	return ret;
	    	
	    }

	    public int findPivot(final List<Integer> A) {
	    	int right = A.size() - 1;
			int end = A.get(right);
	    	int left = 0;
	    	//find pivot point
	    	while(left < right) {
	    		int mid = (left + right + 1) / 2;
	    		int val = A.get(mid);
	    		if(val > end) {
	    			left = mid;
	    		} else {
	    			right = mid - 1;
	    		}
	    	}
			return left;
		}
	}

}
