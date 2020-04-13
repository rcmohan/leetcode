package com.crajas.leetcode.thirtydays;

import java.util.Arrays;
import java.util.BitSet;

public class CountingElements {

	class Solution {
		
		
	    public int countElements(int[] arr) {
			BitSet bs = new BitSet(1001);
	    	int x = 0;
	    	
	    	for (int i = 0; i < arr.length; i++) {
	    		bs.set(arr[i]);
			}
	    	System.out.println(Arrays.toString(arr));
	    	for (int i = 0; i < arr.length; i++) {
	    		if(bs.get(arr[i] + 1)) {
	    			x ++;
	    		}
			}
	    	return x;
	    }
	}
}
