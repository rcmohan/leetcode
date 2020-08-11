package com.crajas.fb.interview.pointers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSumZero {
	public class Solution {

		public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
			A.sort((a, b) -> a - b);

			ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
			Map<String, ArrayList<Integer>> map = new HashMap<>();

			ArrayList<Integer> negs = new ArrayList<Integer>();
			ArrayList<Integer> poss = new ArrayList<Integer>();

			for (int i : A) {
				if (i < 0) {
					negs.add(i);
				} else {
					poss.add(i);
				}
			}

			for (int in : negs) {
				for (int pn : poss) {
					int x = in + pn;
					if (x != in && x != pn) {
						if (search(A, x)) {
							ArrayList<Integer> trips = new ArrayList<Integer>();
							trips.add(in);
							trips.add(pn);
							trips.add(x);
//							res.add(trips);
						}
					}
				}
			}
			return res;

		}

		public boolean search(List<Integer> a, int x) {
			int l = 0;
			int r = a.size() - 1;
			while (l < r) {
				int mid = (l + r + 1) / 2;
				
//				System.out.println(String.format("%d, %d, %d, %d == %d", l, r, mid, x, a.get(mid)));
				
				if (a.get(mid) > x) {
					r = mid - 1;
				} else {
					l = mid;
				}
			}
			
//			System.out.println(String.format("%d, %d, %d, %d == %d", l, r, l, x, a.get(l)));
			
			
			return x == a.get(l);

		}
	}

}
