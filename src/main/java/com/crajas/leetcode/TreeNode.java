package com.crajas.leetcode;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(val).append(",");
		if(left != null) sb.append(left); else sb.append("X,");
		if(right != null) sb.append(right); else sb.append("X,");
		return sb.toString();
		
	}

}
