package com.crajas.leetcode;


/**
 * Solution to https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
 * 
 * Success Details >
 * Runtime: 2 ms, faster than 99.94% of Java online submissions for Median of Two Sorted Arrays.
 * Memory Usage: 41.9 MB, less than 99.31% of Java online submissions for Median of Two Sorted Arrays.
 * 
 * @author B002471
 *
 */
public class MedianOfTwoSortedArrays {

	public
	
	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    	int tot = nums1.length + nums2.length;
	        int i = 0, j = 0, k = 0;
	        int curr = 0;
	        if(nums1.length == 0 || nums2.length == 0) {
	        	return findMedianSingleArray((nums1.length == 0) ? nums2 : nums1);
	        }
	        int midpoint = (tot + 1) / 2 - 1;
	        boolean even = tot % 2 == 0;
	        while (i <= midpoint && j < nums1.length && k < nums2.length) {
	        	if(nums1[j] < nums2[k]) {
	        		curr = nums1[j];
	        		j++;
	        	} else {
	        		curr = nums2[k];
	        		k ++;
	        	}
	        	i ++;
	        }
	        int next = 0;
	        if (i <= midpoint) {
	        	int [] nums =  null;
	        	int l = 0;
	        	if(j == nums1.length) { 
	        		nums = nums2;
	        		l = k;
	        	} else {
	        		nums = nums1;
	        		l = j;
	        	}
	        	while(i <= midpoint) {
	        		curr = nums[l];
	        		l ++;
	        		i ++;
	        	}
	        	next = nums[l];
	        } else {
	        	if(j == nums1.length) { 
	        		next = nums2[k];
	        	} else if (k == nums2.length) {
	        		next = nums1[j];
	        	} else if(nums1[j] < nums2[k]) {
	        		next = nums1[j];
	        	} else {
	        		next = nums2[k];
	        	}
	        }
	        
	        return even ? (curr + next) / 2.0 : curr;
	        
	    }

		private double findMedianSingleArray(int[] n) {
			int mid = n.length / 2;
			return (n.length % 2 == 0) ? (n[mid] + n[mid - 1]) / 2.0 : n[mid];
 		}
	}
	
	
}
