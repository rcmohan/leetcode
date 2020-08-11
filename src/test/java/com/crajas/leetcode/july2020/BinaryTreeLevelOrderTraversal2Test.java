package com.crajas.leetcode.july2020;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.crajas.leetcode.TreeNode;

class BinaryTreeLevelOrderTraversal2Test {

	BinaryTreeLevelOrderTraversal2.Solution s = new BinaryTreeLevelOrderTraversal2().new Solution();
	
	static final Integer[][] TC =  {
			{3,9,20,null,null,15,7}
		//   0 1 2  3    4    5  6
//			   0 0  1    1    2  2
//			 1 2 3  4    5    6  7
	};
	
	@Test
	void test() {
		int i = 0;
		TreeNode tree = toTree(TC[i], 0);
		System.out.println(tree);
		List<List<Integer>> tn = s.levelOrderBottom(tree);
	}

	private TreeNode toTree(Integer[] tc2, int i) {
		TreeNode tn = new TreeNode(tc2[i]);
		int x = i * 2 + 1;
		if(x < tc2.length) {
			tn.left = tc2[x] == null ? null : toTree(tc2, x);
		}
		x ++;
		if(x < tc2.length) {
			tn.right = tc2[x] == null ? null : toTree(tc2, x);
		}
		return tn;
	}

}
