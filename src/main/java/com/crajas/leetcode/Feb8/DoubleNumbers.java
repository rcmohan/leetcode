package com.crajas.leetcode.Feb8;

import java.util.Arrays;
import java.util.BitSet;

public class DoubleNumbers {

	public
	
	class Solution {
	    public boolean checkIfExist(int[] arr) {
			BitSet bsPos = new BitSet();
			BitSet bsNeg = new BitSet();
			boolean isZero = false;
	        for(int i : arr) {
	        	if(i == 0) {
	        		if(isZero) return true;
	        		else isZero = true;
	        	}
	        	BitSet bs = null;
	        	if(i < 0) {
	        		i = -i;
	        		bs = bsNeg;
	        	}
	        	else bs = bsPos;
	        	// already found double
	        	if(bs.get(i * 2)) {
	        		return true;
	        	}
	        	else {
	        		if(i % 2 == 0) {
	        			if(bs.get(i / 2)) return true;
	        		}
	        		bs.set(i);
	        	}
	        }
	        return false;
	    }
	}
}
