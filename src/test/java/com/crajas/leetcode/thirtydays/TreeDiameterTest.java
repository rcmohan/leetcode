package com.crajas.leetcode.thirtydays;

import org.junit.jupiter.api.Test;

import com.crajas.leetcode.TreeCreator;
import com.crajas.leetcode.TreeNode;

class TreeDiameterTest {

	TreeDiameter.Solution sol = new TreeDiameter().new Solution();
	
	@Test
	void test() {
		TreeNode tn = TreeCreator.create(new Integer[] {4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2});
		System.out.println(sol.diameterOfBinaryTree(tn));
	}

}
