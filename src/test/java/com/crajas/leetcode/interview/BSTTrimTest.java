package com.crajas.leetcode.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crajas.leetcode.TreeCreator;
import com.crajas.leetcode.TreeNode;

class BSTTrimTest {

	BSTTrim.Solution s = new BSTTrim().new Solution();
	
	@Test
	void test() {
		TreeNode tc = TreeCreator.create(new Integer[] {45,30,46,10,36,null,49,8,24,34,42,48,null,4,9,14,25,31,35,41,43,47,null,0,6,null,null,11,20,null,28,null,33,null,null,37,null,null,44,null,null,null,1,5,7,null,12,19,21,26,29,32,null,null,38,null,null,null,3,null,null,null,null,null,13,18,null,null,22,null,27,null,null,null,null,null,39,2,null,null,null,15,null,null,23,null,null,null,40,null,null,null,16,null,null,null,null,null,17});
		tc = s.trimBST(tc, 32, 44);
		System.out.println(pre(tc));
	}
	
	private String pre(TreeNode tc) {
		StringBuffer s = new StringBuffer();
		s.append(tc.val).append(" ");
		if(tc.left != null) s.append(pre(tc.left));
		if(tc.right != null) s.append(pre(tc.right));
		return s.toString();
	}

}
