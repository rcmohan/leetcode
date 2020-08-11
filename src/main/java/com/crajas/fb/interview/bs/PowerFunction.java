package com.crajas.fb.interview.bs;

public class PowerFunction {
	public class Solution {
	    public int pow(int x, int n, int d) {
	    	
	    	
	    	if(x == 0) return 0;
	    	if(n == 0) return 1;
	    	
	        int val = n;
	        
	        Long prod = 1l;
	        long pow = x;
	        while(val > 0) {
	            if(val % 2 == 1) {
	                prod = (prod * pow) % d;
	                val --;
	            } else {
	                pow = (pow * pow) % d;
	                val >>= 1;
	            }
	            
//	            System.out.println(String.format("x = %d, pow = %d, prod = %d, d = %d", val, pow, prod, d));
	            
	        }
	        if(prod < 0) prod += d;
	        return prod.intValue();
	    }
	}


}
