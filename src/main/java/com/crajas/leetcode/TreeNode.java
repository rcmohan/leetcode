package com.crajas.leetcode;


/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) { val = x; }
	@Override
		public String toString() {
			return val + ", " + (left != null) + ":" + (right != null);
		}
	 
}
