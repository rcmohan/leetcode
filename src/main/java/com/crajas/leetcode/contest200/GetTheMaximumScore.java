package com.crajas.leetcode.contest200;

public class GetTheMaximumScore {
	class Solution {
    	public static final long MODDER = 1_000_000_007;
	    public int maxSum(int[] nums1, int[] nums2) {
	 
	    	
	    	Long sum = 0l;
	    	
	    	int j  = 0;
	    	int k = 0;
	    	Long nums1sum = 0l;
	    	Long nums2sum = 0l;
	    	while(j < nums1.length && k < nums2.length) {
	    		int n1 = nums1[j];
	    		int n2 = nums2[k];
	    		if(n1 == n2) {
	    			sum += nums1sum > nums2sum ? nums1sum : nums2sum;
	    			sum %= MODDER;
	    			nums1sum = (long) n1;
	    			nums2sum = (long) n1;
	    			j ++;
	    			k ++;
	    		} else if(n1 < n2) {
	    			nums1sum += n1;
//	    			nums1sum %= MODDER;
	    			j ++;
	    		} else {
	    			nums2sum += n2;
//	    			nums2sum %= MODDER;
	    			k ++;
	    		}
	    	}
	    	if(j < nums1.length) {
	    		while (j < nums1.length) {
	    			nums1sum += nums1[j];
//	    			nums1sum %= MODDER;
	    			j ++;
	    		}
    		} else {
	    		while (k < nums2.length) {
	    			nums2sum += nums2[k];
//	    			nums2sum %= MODDER;
	    			k ++;
	    		}
    		}
			sum += nums1sum > nums2sum ? nums1sum : nums2sum;
			sum %= MODDER;
			
			return sum.intValue();
			
	    }
	}
}
