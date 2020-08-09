package com.crajas.fb.interview;

import java.util.Arrays;
import java.util.List;

public class MaxSubArray {

	public class Solution {
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	       public int maxSubArray(final List<Integer> A) {
	            Long sum = Long.MIN_VALUE;
	            int len = A.size();
	            if(len > 0) {
	                if(len == 1) {
	                    sum = 0l + A.get(0);
	                } else {
	                    sum = populate(A.toArray(new Integer[0]));
	                }
	            }
	            
	            return sum.intValue();
	        }

	    public long populate(Integer[] arr) {
	        long max = Long.MIN_VALUE;
	        long cmax = 0;
	        for (int j = 0; j < arr.length; j++) {
	        	// if sum so far is less than zero, just pick the next smallest negative number
	            if(cmax < 0){
	                cmax = arr[j];
	            // else see if adding the next number increases the sum
	            } else {
	                cmax += arr[j];
	            }
	            if(cmax > max) max = cmax;
	            System.out.println(Arrays.toString(arr) + ",\tmax=" + max + ",\tcmax=" + cmax);
	        }
	        return max;
	    }
	}

}
