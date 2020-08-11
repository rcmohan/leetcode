package com.crajas.leetcode.jul2020;

public class ArrangingCoins {
	class Solution {
	    public int arrangeCoins(int n) {
	        int rows = 0;
	        long sum = 0;
	        while(sum <= n) {
	        	rows ++;
	        	sum += rows;
	        }
	        
	        return rows - 1;
	    }
	}
}
