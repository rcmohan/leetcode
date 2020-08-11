package com.crajas.leetcode.interview;

import com.crajas.leetcode.TreeNode;

public class BSTTrim {

	class Solution {
	    public TreeNode trimBST(TreeNode root, int l, int r) {
	        
			
			while(root.val < l || root.val > r) {
				int c = 0;
				if(root.val < l) {
					root = root.right;
					if(root == null) return null;
					c++;
				};
				if (root.val > r) {
					root = root.left;
					if(root == null) return null;
					c++;
				}
				if(c == 0) break;
			}
			if(root.left != null) root.left = trimBST(root.left, l, r);
			if(root.right != null) root.right = trimBST(root.right, l, r);
			return root;
		}
	}
}
