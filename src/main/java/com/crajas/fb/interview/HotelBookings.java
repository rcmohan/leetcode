package com.crajas.fb.interview;

import java.util.ArrayList;
import java.util.List;

public class HotelBookings {

	public class Solution {
		class Pair {
			Integer time;
			boolean isStart;
			Pair(Integer i, boolean b) { time = i; isStart = b; }
			@Override
			public String toString() { return String.format("[%d, %s]", time, isStart ? "Arr" : "Dep"); }
			
		}
	    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
	    	if(K == 0 && arrive.size() > 0) {
	    		return false;
	    	}
	    	
	    	List<Pair> pairs = new ArrayList<Pair>();
	    	
	    	for (int i = 0; i < arrive.size(); i++) {
	    		if(arrive.get(i) != depart.get(i)) {
					Pair p1 = new Pair(arrive.get(i), true);
					pairs.add(p1);
					p1 = new Pair(depart.get(i), false);
					pairs.add(p1);
	    		}
			}
	    	
	    	pairs.sort((p1, p2) -> {
	    		int x = p1.time - p2.time;
	    		if(x == 0) {
	    			if(p1.isStart && !p2.isStart) {
	    				return 1;
	    			} 
	    			if(p2.isStart && !p1.isStart) {
	    				return -1;
	    			} 
	    			return 0;
	    		} else {
	    			return x;
	    		}
	    	});
	    	
	    	int conflicts = 0;

	    	
	    	for(Pair p : pairs) {
	    		if(p.isStart) {
	    			conflicts ++;
	    		} else {
	    			conflicts --;
	    		}
	    		if(conflicts > K) {
	    			return false;
	    		}
	    	}
	    	return true;
	    	
	    }
	}

	
}
