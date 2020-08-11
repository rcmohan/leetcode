package com.crajas.fb.interview;

import java.util.List;

public class LongestIncreasingSubseq {

	public class Solution {
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public int lis(final List<Integer> A) {
	        Integer[] seq = new Integer[A.size()];
	        int p = 0;
	        seq[p] = A.get(0);
	        for(int i = 1; i < A.size(); ++i) {
	            Integer j = A.get(i);
	            if (j > seq[p]) {
	                p ++;
	                seq[p] = j;
	            } else {
	                int p1 = 0;

	                while(p1 <= p && j > seq[p1]) {
	                    p1++;
	                } 
	                seq[p1] = j;
	            }
	        }
	        return p + 1;
	    }

		private String print(Integer[] seq, int p) {
			StringBuilder s = new StringBuilder();
			for (int i = 0; i <= p; i++) {
				s.append(seq[i]).append(",");
			}
			return s.toString();
		}
	}

}
