package com.crajas.leetcode.jul2020;

import java.util.ArrayList;
import java.util.List;

import com.crajas.leetcode.TreeNode;

public class MaximumWidthOfBinaryTree {

	class Solution {
	    public int widthOfBinaryTree(TreeNode root) {
	    	int width = 0;
	        if(root != null) {
		        width = count(root);
	        }
	        
	        return width;
	    }

		private int count(TreeNode root) {
			
			while(root.left == null || root.right == null) {
				if(root.left == null && root.right == null) {
					return 1;
				}
				if(root.left == null) root = root.right; else root = root.left;
			}
			List<TreeNode> qs = new ArrayList<TreeNode>();
			qs.add(root);
			int width = qs.size();
			List<TreeNode> r = qs;
			int nonnulls = qs.size();
			List<Integer> indices = new ArrayList<Integer>();
			indices.add(1);
			while(nonnulls > 0) {
				nonnulls = 0;
				List<TreeNode> nl = new ArrayList<TreeNode>();
				List<Integer> newindices = new ArrayList<Integer>();
				for(int i = 0; i < r.size(); ++i) {
					TreeNode tn = r.get(i);
					Integer index = indices.get(i);
					if(tn != null && (tn.left != null || tn.right != null)) {
						nl.add(tn.left); if(tn.left != null) nonnulls ++;
						newindices.add(index * 2 + 1);
						nl.add(tn.right); if(tn.right != null) nonnulls ++;
						newindices.add(index * 2 + 2);
					}
				}
				r = nl;
				indices = newindices;
				if(indices.size() > 0) {
					int last = indices.get(indices.size() - 1);
					int first = indices.get(0);
					if(r.get(r.size() - 1) == null) last --;
					if(r.get(0) == null) first ++;
					int t = (last - first + 1);
					if(t > width) width = t;
				}
				System.out.println(r);
				System.out.println(indices);
				System.out.println(width);
			} 
			return width;
		}
	}
}
