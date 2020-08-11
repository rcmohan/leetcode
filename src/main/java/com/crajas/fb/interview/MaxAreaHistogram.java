package com.crajas.fb.interview;

public class MaxAreaHistogram {

	public int maxArea(int[] histogram) {
		int area = 0;
		if(histogram.length > 0) {
			if(histogram.length == 1) {
				area = histogram[0];
			} else {
				
				int l = 1;
				while(l < histogram.length) l <<= 1;
				int l2 = l;
				l = l * 2;
				
				/*
				 *   0 1 2 3   n
				 *   
				 *   0+1+2+3.0+1,2+3,0,1,2,3
				 *      0         2  3 4 5 6
				 *
				 *   4 - 3
				 *   8 - 7/8
				 *   0+1+2+3+4+5+6+7,0+1+2+3,4+5+6+7,0+1,2+3.4+5,6+7,0,1,2,3,4,5,6,7
				 *         0            1      2      3   4   5   6  7 8 9 0 1 2 3 4
				 *         
				 *   
				 *      
				 */
				l2 --;
				int[] segs = new int[l];
				for (int i = 0; i < histogram.length; i++) {
					segs[l2+i] = histogram[i];
				}
				for (int i = l2; i >=0; i--) {
					segs[l2] = segs[l2*2+1] + segs[l2*2+2];
				}
			}
		}
		
		return area;
		
		
	}
	
}
