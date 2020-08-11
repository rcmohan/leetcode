package com.crajas.fb.interview.pointers;

import java.util.ArrayList;
import java.util.List;

public class TwoArrayIntersection {
	
	public class Solution {
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
	    	
	    	ArrayList<Integer>  dups = new ArrayList<Integer>();
	    	
	    	int aPtr = 0;
	    	int bPtr = 0;
    		int a = A.get(aPtr);
    		int b = B.get(bPtr);
	    	
	    	while(aPtr < A.size() && bPtr < B.size()) {
//	    		System.out.println(String.format("A[%d]=%d, B[%d]=%d", aPtr, a, bPtr, b));
	    		if(a == b) {
	    			dups.add(a);
	    			aPtr ++;
	    			bPtr ++;
	        		if(aPtr < A.size()) a = A.get(aPtr);
	        		if(bPtr < B.size()) b = B.get(bPtr);
	    		} else if(a < b) {
	    			aPtr ++;
	        		if(aPtr < A.size()) a = A.get(aPtr);
	    		} else {
	    			bPtr ++;
	        		if(bPtr < B.size()) b = B.get(bPtr);
	    		}
	    	}
	    	return dups;
	    }
	}
}
