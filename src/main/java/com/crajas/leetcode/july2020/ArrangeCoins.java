package com.crajas.leetcode.july2020;

public class ArrangeCoins {

	class Solution {
	    public int arrangeCoins(int n) {
	        int i = 1;
	        long j = 1;
	        while(j <= n) {
	        	i++;
	        	j += i;
	        }
	        
	        return i - 1;
	    }
	}
}
