package com.crajas.fb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class RotateMatrix {

	public class Solution {
		public void rotate(ArrayList<ArrayList<Integer>> a) {
	    	int min = 0;
	    	int max = a.size();
	    	
	    	int [][] a1 = new int[max][max];
	    	
	    	max --;
	    	
	    	for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a1.length; j++) {
					a1[i][j] = a.get(i).get(j); 
				}
			}
	    	

	    	int t = a1[0][0];
	    	while(min < max) {
		    	
	    		for(int i = min+1; i <= max; ++i) {
	    			int x = a1[min][i];
	    			a1[min][i] = t;
	    			t = x;
	    			
	    		}

	    		for (int i = min+1; i <= max; i++) {
					int x = a1[i][max];
					a1[i][max] = t;
					t = x;
				}
	    		

	    		for(int i = max-1; i >= min; --i) {
	    			int x = a1[max][i];
	    			a1[max][i] = t;
	    			t = x;
	    		}
	    		
	    		for(int i = max-1; i >= min; --i) {
	    			int x = a1[i][min];
	    			a1[i][min] = t;
	    			t = x;
	    		}
	    		
		    	min ++;
		    	max --;
	    	}
	    	
	    	
	    	
	    	for (int i = 0; i < a1.length; i++) {
	    		for (int j = 0; j < a1.length; j++) {
					a.get(i).set(j, a1[i][j]);
				}
			}
	    }

	}

}
