package com.crajas.fb.interview;

import java.util.ArrayList;

public class MergeSequences {

	/**
	 * Definition for an interval.
	 * public class Interval {
	 *     int start;
	 *     int end;
	 *     Interval() { start = 0; end = 0; }
	 *     Interval(int s, int e) { start = s; end = e; }
	 * }
	 */
		
	public class Solution {
	    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

	    	ArrayList<Interval> ret = new ArrayList<Interval>();
	    	
	    	if(newInterval.start > newInterval.end) {
	    	    int t= newInterval.start;
	    	    newInterval.start = newInterval.end;
	    	    newInterval.end = t;
	    	}
	    	
	    	boolean added = false;

            if(intervals == null || intervals.size() == 0) {
                ret.add(newInterval);
                return ret;
            }
            if(newInterval.end < intervals.get(0).start) {
	    		ret.add(newInterval);
	    		ret.addAll(intervals);
	    		added = true;
	    	} else if(newInterval.start < intervals.get(0).start) {
	    		int j = 0;
	    		while(j < intervals.size() && intervals.get(j).start < newInterval.end) {
	    			if(newInterval.end < intervals.get(j).end) {
	    				newInterval.end = intervals.get(j).end;
	    			} else {
	    				j ++;
	    			}
				}
	    		ret.add(newInterval);
	    		while(j < intervals.size()) {
	    			ret.add(intervals.get(j));
	    			j ++;
	    		}
	    		added = true;
	    	} else {
		    	for (int j = 0; j < intervals.size(); j++) {
		    		Interval intvl = intervals.get(j);
		    		if(intvl.end >= newInterval.start && intvl.end <= newInterval.end) {
		    			intvl.end = newInterval.end;
		    			j ++;
			    		if(j < intervals.size()) {
			    			Interval intvl2 = intervals.get(j);
				    		if(intvl2.start <= newInterval.end) {
				    			while(j < intervals.size() && intvl2.start <= newInterval.end) {
					    			intvl.end = intvl2.end;
					    			j ++;
					    			if(j < intervals.size()) {
					    			    intvl2 = intervals.get(j);
					    			}
				    			}
				    		}
			    		}
		    			added = true;
		    		} else {
		    			ret.add(intvl);
		    		}
				}
		    	
				if(!added) ret.add(newInterval);
	    	}
	    	
	    	return ret;
	    	
	    }

	}


}
