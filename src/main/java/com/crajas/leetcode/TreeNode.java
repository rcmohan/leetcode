package com.crajas.leetcode;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) { val = x; }

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
//		return String.format("[%d-%s<>%s]", val, (left == null) ? "X" : right.toString(), (right == null) ? "X" : right.toString());
		return String.format("[%d]", val);
	}
	
	 
}
