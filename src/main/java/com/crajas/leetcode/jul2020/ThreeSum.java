package com.crajas.leetcode.jul2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {
	class Solution {
		
		class Pair { int a, b; public Pair(int x, int y) { a=x;b=y; } @Override public String toString() {return String.format("[%d,%d]", a, b);}}
		
	    public List<List<Integer>> threeSum(int[] nums) {
	    	
//	    	Integer[] numInts = shrink(nums);
	    	int[] numInts = nums;
	    	List<List<Integer>> list = new ArrayList<>();
	    	Map<Integer, Pair> map = new HashMap<>();
	    	Set<BitSet> set = new HashSet<>();
	    	
	    	for (int i = 0; i < numInts.length; i++) {
				for(int j = i + 1; j < numInts.length; ++j) {
					for (int k = j + 1; k < numInts.length; k++) {
						if(numInts[i] + numInts[j] + numInts[k] == 0) {
//							list.add(Arrays.asList(numInts[i], numInts[j], numInts[k]));
							BitSet bs = new BitSet();
							bs.set(i); bs.set(j); bs.set(k);
							System.out.println(bs);
							set.add(bs);
						}
					}
				}
			}
	    	for(BitSet bs : set) {
	    		List<Integer> ls = new ArrayList<>();
	    		int x = bs.nextSetBit(0);
	    		ls.add(nums[x]);
	    		x = bs.nextSetBit(x + 1);
	    		ls.add(nums[x]);
	    		x = bs.nextSetBit(x + 1);
	    		ls.add(nums[x]);
	    		list.add(ls);
	    		
	    	}
	    	System.out.println(list);
	    	return list;
	    	
	    }

		private Integer[] shrink(int[] nums) {
			Arrays.sort(nums);
			List<Integer> l = new ArrayList<>();
			l.add(nums[0]);
			int last = nums[0];
			for (int i = 1; i < nums.length; i++) {
				if(nums[i] != last) {
					l.add(nums[i]);
					last = nums[i];
				}
			}
			System.out.println(l);
			return l.toArray(new Integer[0]);
			
		}
	}
}
