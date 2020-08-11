package com.crajas.fb.interview.arrays;

import java.util.ArrayList;
import java.util.List;

public class KthLargestUnsorted {

	public int kth(List<Integer> all, int k) {
		int res = -1;
		for(int i = 0; i < k; ++i) {
			res = all.get(i);
			int ndx = i;
			for(int j = i + 1; j < all.size(); ++j) {
				if(res < all.get(j)) {
					res = all.get(j);
					ndx = j;
				}
			}
			if(i != ndx) {
				int t = all.get(i);
				all.set(i, all.get(ndx));
				all.set(ndx, t);
			}
		}
		return res;
		
	}
	public int kth2(List<Integer> all, int k) {
 		int res = Integer.MIN_VALUE;
		boolean found = false;
		while(!found) {
			if(all.size() == 2) {
				System.out.println("Size 2");
				System.out.println(all);
				System.out.println(k);
				if(k == 2) {
					res = Math.max(all.get(0), all.get(1));
				} else {
					res = Math.min(all.get(0), all.get(1));
				}
				found = true;
			} else if(all.size() == 1) {
				res = all.get(0);
				found = true;
			} else {
				List<Integer> smaller = new ArrayList<Integer>();
				List<Integer> larger = new ArrayList<Integer>();
				int p = all.get(0);
				smaller.add(p);
				System.out.println("larger:" + larger);
				System.out.println("smaller:" + smaller);
				System.out.println(p);
				System.out.println(k);
	
				for(int i = 1; i < all.size(); ++i) {
					if(all.get(i) > p) {
						larger.add(all.get(i));
					} else {
						smaller.add(all.get(i));
					}
				}
	
				System.out.println("larger:" + larger);
				System.out.println("smaller:" + smaller);
				System.out.println(p);
				System.out.println(k);
	
				if(larger.size() == k - 1) {
					res = p;
					found = true;
				} else {
					if(larger.size() > k) {
						all = larger;
					} else if(larger.size() == k){
						res = min(larger);
						found = true;
						System.out.println("Found " + res);
					} else if(smaller.size() == k){
						res = max(smaller);
					} else {
						all = smaller;
						k -= larger.size();
					}
				}
				System.out.println("larger:" + larger);
				System.out.println("smaller:" + smaller);
				System.out.println(p);
			}
			System.out.println(k);

		}
		
		return res;
	}

	private int max(List<Integer> smaller) {
		int max = smaller.get(0);
		int j = 1;
		while(j < smaller.size()) {
			if(max < smaller.get(j)) max = smaller.get(j);
			j ++;
		}
		return max;
	}

	private int min(List<Integer> larger) {
		int min = larger.get(0);
		int j = 1;
		while(j < larger.size()) {
			if(min > larger.get(j)) min = larger.get(j);
			j ++;
		}
		return min;
	}
}
