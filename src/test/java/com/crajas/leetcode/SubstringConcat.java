package com.crajas.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubstringConcat {

	class Solution {

		public List<Integer> findSubstring(String s, String[] words) {
	        Set<Integer> positions = new TreeSet<>();
			if(s.length() > 0 && words.length > 0) {  
		        List<String> permutations = getPermutations(words);
		        for(String word : permutations) {
		        	int pos = -1;
		        	do {
		        		pos = s.indexOf(word, pos + 1);
		        		if(pos >= 0) positions.add(pos);
		        	}while(pos >= 0);
		        }
			}
	        List<Integer> list = new ArrayList<>();
	        list.addAll(positions);
	    	return list;
	    }
		
		public List<String> getPermutations(String[] words) {
			List<String> list = new ArrayList<>();
			int n = words.length;
			int[] indices = new int[n];
			int x = n ;
			while(x-- > 0) { indices[x] = x; }
            permute(list, words, n); 
  
			return list;
		}

		private void permute(List<String> list, String[] elements, int n) {
			

		    if(n == 1) {
		    	addForSequence(list, elements);
		    } else {
		        for(int i = 0; i < n-1; i++) {
		        	permute(list, elements, n - 1);
		            if(n % 2 == 0) {
		                swap(elements, i, n-1);
		            } else {
		                swap(elements, 0, n-1);
		            }
		        }
		        permute(list, elements, n - 1);
		    }
		}


		private void addForSequence(List<String> list, String[] words) {
			int x = words.length;
			StringBuilder s = new StringBuilder();
			while(x-- > 0) {
				s.append(words[x]);
			}
			list.add(s.toString());
		}

		private String[] swap(String[] indices, int n, int i) {
			String t = indices[n];
			indices[n] = indices[i];
			indices[i] = t;
			return indices;
		}
	    
	    
	}
}
