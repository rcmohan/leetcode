package com.crajas.leetcode.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crajas.leetcode.ListNode;
import static com.crajas.leetcode.ListNodeUtils.*;


class ReverseNodesKGroupTest {

	ReverseNodesKGroup.Solution s = new ReverseNodesKGroup().new Solution();
	
	int TESTS[][] = {
			{1, 2, 3, 4, 5, 6},
			{1},
			{1, 2, 3, 4, 5, 6},
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			{1, 2, 3, 4, 5, 6},
	};
	
	int[] QS = {
			4,
			2,
			8,
			6,
			2
	};
	
	int ANS[][] = {
			{4, 3, 2, 1, 5, 6},
			{1},
			{6, 5, 4, 3, 2, 1},
			{6, 5, 4, 3, 2, 1, 7, 8, 9, 10},
			{2, 1, 4, 3, 6, 5}
	};
	
	@Test
	void test() {
		int j = TESTS.length;
		while(j-- > 0) {
			ListNode ln = getListNodes(TESTS[j]);
			System.out.println("Rotating " + ln + ", " + QS[j]);
			ln = s.reverseKGroup(ln, QS[j]);
			System.out.println("Rotated " + ln);
			
			assertLists(getListNodes(ANS[j]), ln);
			
		}
	}

}
