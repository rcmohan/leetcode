package com.crajas.fb.interview.pointers;

import java.util.ArrayList;

public class ThreeSum {

	public class Solution {
		class Triplet {
			int i, j, k;
			
		}
		boolean debug = true;
	    public int threeSumClosest(ArrayList<Integer> A, int B) {
	    	int minDiff = Integer.MAX_VALUE;
	    	int currSum = Integer.MIN_VALUE;
	    	A.sort((a,b) -> a - b);
	    	
	    	for(int i = 0; i < A.size() - 1; ++i) {
	    		for(int j = i + 1; j < A.size(); ++j) {
		    		int frst = A.get(i);
		    		int last = A.get(j);
		    		int sum = frst+last;
		    		
	    		}
	    	}
	    	
	    	return currSum;
	    	
	    }

	    /*
	     * 		    		
	     			int x = findClosest(A, B - sum, i, j);
		    		sum += A.get(x);
		    		sum = sum < 0 ?-sum : sum;
		    		x = sum - B;
		    		x = x < 0 ? -x : x;
		    		if(sum < minDiff) {
		    			minDiff = x;
		    			currSum = sum;
		    			System.out.println("minDiff="+minDiff + ", currSum=" + currSum);
		    		}

	     */
	    
		public int findClosest(ArrayList<Integer> a, int val, int i, int j) {
			if(debug) System.out.println(a + ", " + val + ", " + i + ", " + j);
			int l = 0;
			int r = a.size() - 1;
			while(l < r) {
				int mid = (l + r +1) / 2;
				if(debug) System.out.println(String.format("%d %d %d", l, r, mid));
				Integer x = a.get(mid);
				if(i != mid && j != mid && x == a.get(j)) {
					l = mid;
					break;
				} else {
					if(x > val) {
						r = mid - 1;
					} else {
						l = mid;
					}
				}
			}
			if(a.get(l) != val || i == l || j == l) {
				int minDiff = 0;
				int l2 = l - 1;
				while(l2 > 0 && (l2 == i || l2 == j)) {
					l2 --;
				}
				if(l2 >= 0) { 
					minDiff = val - a.get(l2);
					if(debug) System.out.println(val + " - " + a.get(l2));
					if(minDiff < 0) minDiff = -minDiff;
					l = l2;
					if(debug) System.out.println("Choosing left " + minDiff + ", " + l2);
				}
				
				l2 = l + 1;
				while(l2 < a.size() && (l2 == i || l2 == j)) {
					l2 ++;
				}
				if(l2 < a.size()) {
					int x = val - a.get(l2);
					if(debug) System.out.println(val + " - " + a.get(l2));
					if(x < 0) x = -x;
					if(minDiff > x) {
						minDiff = x;
						l = l2;
						if(debug) System.out.println("Switching to right " + minDiff + ", " + l2);
					}
				}
			}
			return l;
			
			
			
		}
	}
}
