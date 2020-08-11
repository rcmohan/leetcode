package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListNodeUtils {

	public static ListNode getListNodes(int[] is) {
		ListNode x = new ListNode(0);
		ListNode t = x;
		for (int i : is) {
			ListNode y = new ListNode(i);
			t.next = y;
			t = y;
		}
		return x.next;
	}

	public static String printList(ListNode l) {
		StringBuffer s = new StringBuffer();
		while(l != null) {
			s.append(l);
			l = l.next;
		}
		return s.toString();
	}
	
	public static void assertLists(ListNode l, ListNode r) {
		StringBuffer l1 = new StringBuffer();
		StringBuffer l2 = new StringBuffer();
		System.out.println("Comparing " + l + " and " + r);
		
		while(l != null) {
			assertEquals(l.val, r.val);
			l = l.next;
			r = r.next;
			l1.append(l);
			l2.append(r);
		}
	}

}
