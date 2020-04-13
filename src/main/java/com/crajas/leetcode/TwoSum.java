package com.crajas.leetcode;

import java.util.BitSet;

/**
 * {@link TwoSum} solves two-sum problem in leetcode (https://leetcode.com/problems/two-sum/)
 * 
 * @author B002471
 */
public class TwoSum {

	public class Solution {
	    public int[] twoSum(int[] nums, int target) {

	    	SoFar soFar = new SoFar();
	        for(int i = 0; i < nums.length; ++i) {
	        	int num = nums[i];
	        	int other = target-num;
	        	if(soFar.contains(other)) {
	        		return getPositions(nums, other, num);
	        	} else {
	        		soFar.add(num);
	        	}
	        }
	        return null;
	    }

		private int[] getPositions(int[] nums, int num1, int num2) {

			int j = 0;
			int left = 0;
			int right = 0;
			while (j < nums.length) {
				if(nums[j] == num1) {
					left = j;
					j ++;
					break;
				}
				j ++;
			}
			while (j < nums.length) {
				if(nums[j] == num2) {
					right = j;
					break;
				}
				j++;
			}
			return new int [] {left, right};
		}
		
		public class SoFar {
			
			BitSet bs = new BitSet();
			BitSet bs2 = new BitSet();
			int zerop = -1;
			boolean contains(int j) {
				if(j == 0) {
					return zerop != -1;
				} else if ( j < 0 ) {
					return bs2.get(-j);
				} else {
					return bs.get(j);
				}
			}
			
			void add(int j) {
				if(j == 0) {
					zerop = j;
				}
				else if(j < 0) {
					bs2.set(-j);
				} else {
					bs.set(j);
				}
			}
			
		}

	}
}
