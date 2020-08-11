package com.crajas.fb;

import java.util.ArrayList;

public class TransposeMatrix {
	public class Solution {
		public void rotate(ArrayList<ArrayList<Integer>> a) {
	    	int min = 0;
	    	int max = a.size();
	    	
	    	int [][] a1 = new int[max][max];
	    	
	    	max --;
	    	
	    	for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a1.length; j++) {
					a1[j][max-i] = a.get(i).get(j); 
				}
			}
	    	
	    	
	    	for (int i = 0; i < a1.length; i++) {
	    		for (int j = 0; j < a1.length; j++) {
					a.get(i).set(j, a1[i][j]);
				}
			}
	    }

	}

}
