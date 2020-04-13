package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MergeKSortedListsTest {
	

	MergeKSortedLists.Solution s = new MergeKSortedLists().new Solution();
	
	public static final int[][] tc1 = { 
			{ 2, 3, 4 },
			{ 2, 4, 7 },
			{ 1, 8 },
			{ 1 },
			{ 9, 9, 9, 9 }
	};

	public static final int[][] tc2 = { 
			{ 5, 6, 8 }, 
			{ 5, 6, 8 },
			{ 0 },
			{ 9, 9 },
			{ 1 }
	};

	int [][] ans = {
			{ 1, 1, 2, 2, 3, 4, 4, 7, 8, 9, 9, 9, 9 },
			{ 0, 1, 5, 5, 6, 6, 8, 8, 9, 9 }
			
	};
	
	@Test
	void testMerges() {
		ListNode[] one = getLists(tc1);
		ListNode m = s.mergeKLists(one);
		assertLists(getListNodes(ans[0]), m);
		ListNode[] two = getLists(tc2);
		m = s.mergeKLists(two);
		assertLists(getListNodes(ans[1]), m);
	}

	private ListNode[] getLists(int[][] tc) {
		ListNode[] nodes = new ListNode[tc.length];
		for(int i = 0; i < tc.length; ++i) {
			int x = tc.length;
			while(x -- > 0) {
				nodes[x] = getListNodes(tc[x]);
			}
		}
		return nodes;
	}

	private void assertLists(ListNode l, ListNode r) {
		while(l != null) {
			System.out.println(l + " against " + r);
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
