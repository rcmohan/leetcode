package com.crajas.fb.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.crajas.leetcode.AddTwoNumbers;
import com.crajas.leetcode.ListNode;
import com.crajas.leetcode.ListNodeUtils;
import com.crajas.leetcode.AddTwoNumbers.Solution;

class AddListsTest {

	AddLists.Solution s = new AddLists().new Solution();
	
	public static final int[][] l1s = { 
			{7, 2, 4, 3 },
	};

	public static final int[][] l2s = { 
			{ 5, 6, 4 }
	};

	int [][] ans = {
			{ 7, 8, 0, 7 }
			
	};
	
	@Test
	void test() {
		for(int i = 0; i < l1s.length; ++i) {
			ListNode l1 = ListNodeUtils.getListNodes(l1s[i]);
			System.out.println(l1);
			ListNode l2 = ListNodeUtils.getListNodes(l2s[i]);
			System.out.println(l2);
			ListNode l3 = s.addTwoNumbers(l1, l2);
			System.out.println("ANS: " + l3);
			ListNodeUtils.assertLists(ListNodeUtils.getListNodes(ans[i]), l3);
		}
	}
}
