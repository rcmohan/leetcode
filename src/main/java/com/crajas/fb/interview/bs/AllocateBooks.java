package com.crajas.fb.interview.bs;

import java.util.ArrayList;

public class AllocateBooks {
	public class Solution {
		private boolean isDebug = true;
		
	    public int books(ArrayList<Integer> A, int B) {
	    	
	    	int lo = 0;
	    	int hi = A.stream().reduce(0, (a, b) -> a + b);
	    	int count = 0;
	    	if(isDebug) System.out.println(A + " - for " + B);
	    	if(isDebug) System.out.printf("lo = %d, hi = %d\n", lo, hi);
	    	
	    	int maxforeach = 0;
	    	
	    	while(lo < hi) {
	    		int mid = (lo + hi + 1) >> 1;
	    		int each = 0;
	    		maxforeach = 0;
		    	count = 0;

		    	if(isDebug) System.out.println(String.format("\ntry giving each one %d books", mid)); 
		    	for(Integer i : A) {
		    		if(isDebug) System.out.print("[" + i + "," + each + "]");
	    			each += i;
		    		
		    		if(each >= mid) {
		    			if(isDebug) System.out.println(String.format("! %d books for %d", each, count));
		    			count++;
		    			if(maxforeach < each) maxforeach = each;
		    			each = 0;
		    		}
	    		}
		    	if(isDebug) System.out.println("Total " + count + " students satisfied with " +  mid);
	    		if(count < B) {
	    			hi = mid - 1;
	    		} else {
	    			lo = mid;
	    		}
	    		if(count == B) break;
	    	}
	    	if(isDebug) System.out.println("--> " + count + " : " + maxforeach);
	    	return (count == B) ? maxforeach : -1;
	    	
	    }
	}

}
