package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

	public static final int[][] l1s = { 
			{ 2, 4, 3 },
			{ 2, 4, 7 },
			{ 1, 8 },
			{ 1 },
			{ 9, 9, 9, 9 }
	};

	public static final int[][] l2s = { 
			{ 5, 6, 4 }, 
			{ 5, 6, 4 },
			{ 0 },
			{ 9, 9 },
			{ 1 }
	};

	int [][] ans = {
			{7, 0, 8},
			{7, 0, 2, 1},
			{ 1, 8 },
			{ 0, 0, 1 },
			{ 0, 0, 0, 0, 1 }
			
	};
	
	@Test
	void test() {
		for(int i = 0; i < l1s.length; ++i) {
			ListNode l1 = getListNodes(l1s[i]);
			ListNode l2 = getListNodes(l2s[i]);
			AddTwoNumbers.Solution s = new AddTwoNumbers().new Solution();
			ListNode l3 = s.addTwoNumbers(l1, l2);
			assertLists(getListNodes(ans[i]), l3);
		}
	}

	private void assertLists(ListNode l, ListNode r) {
		while(l != null) {
			assertEquals(l.val, r.val);
			l = l.next;
			r = r.next;
		}
	}

	private ListNode getListNodes(int[] is) {
		ListNode x = new ListNode(0);
		ListNode t = x;
		for (int i : is) {
			ListNode y = new ListNode(i);
			t.next = y;
			t = y;
		}
		return x.next;
	}

}

