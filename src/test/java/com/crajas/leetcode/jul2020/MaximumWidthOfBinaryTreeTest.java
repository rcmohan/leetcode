package com.crajas.leetcode.jul2020;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.crajas.leetcode.TreeCreator;
import com.crajas.leetcode.TreeNode;

class MaximumWidthOfBinaryTreeTest {

	private static final Integer TS[][] = new Integer[][] {
		{1, 3, 2, 5, 3, null, 9},
		{1, 3, null, 5, 3, null, null},
		{1, 3, 2, 5, null, null, null},
		{1, 3, 2, 5, null, null, 9, 6, null, null, null, null, null, null, 7},
		{},
		{1},
		{1,2},
		{2,1,4,3,null,5},
		{2,4,1,null,5,3}
	
	};
	
	private static final int[] A = {
			4,
			2,
			2,
			8,
			0,
			1,
			1,
			3,
			2
	};
	
	MaximumWidthOfBinaryTree.Solution sol = new MaximumWidthOfBinaryTree().new Solution();
	
	@Test
	void test() {
		for (int i = 0; i < A.length; i++) {
			TreeNode tn = TreeCreator.create(TS[i]);
			System.out.println("Test case " + i);
			System.out.println(Arrays.toString(TS[i]));
			assertEquals(A[i], sol.widthOfBinaryTree(tn));
		}			
	}

}
