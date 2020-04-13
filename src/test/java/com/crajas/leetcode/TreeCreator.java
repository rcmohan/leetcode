package com.crajas.leetcode;

public class TreeCreator {

	public static TreeNode create(Integer[] nodes) {
		if(nodes.length == 0) {
			return null;
		} else {
			return create(nodes, 0);
		}
	}

	private static TreeNode create(Integer[] nodes, int i) {
		if(i >= nodes.length || nodes[i]==null) return null;
		TreeNode tn = new TreeNode(nodes[i]);
		if(i*2 < nodes.length) tn.left = create(nodes, i * 2 + 1);
		if(i*2+1 < nodes.length) tn.right = create(nodes, i * 2 + 2);
		return tn;
	}
	
}
