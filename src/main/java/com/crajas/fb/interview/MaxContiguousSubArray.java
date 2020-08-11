package com.crajas.fb.interview;

import java.util.List;

public class MaxContiguousSubArray {

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
		long max = arr[0];
		int run = arr[0];
		for (int j = 1; j < arr.length; j++) {
			run = run + arr[j];
			if(run > max) max = run;
			
			if(arr[j] > max) max = arr[j];
		}

		
		for (int i = 1; i < arr.length; i++) {
			run = arr[i];
			if(run > max) max = run;
			for(int j = i+1; j < arr.length; ++j) {
				run += arr[j];
				if(run > max) max = run;
				
			}
		}
		return max;
	}
}
