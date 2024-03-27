package com.crajas.leetcode;

import java.util.List;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	ListNode() {
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		ListNode node = this;
		while (node != null) {
			s.append(String.format("[%d]->", node.val));
			node = node.next;
		}
		return s.toString();
	}

	public static ListNode createFromArray(int[] vals) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		for (int i : vals) {
			ListNode l = new ListNode(i);
			p.next = l;
			p = l;
		}
		return head.next;
	}

	public static boolean compare(ListNode head, int[] vals) {
		int i = 0;
		while(head != null && i < vals.length) {
			if(head.val != vals[i]) {
//				System.out.println(head.val + " and " + vals[i]);
				return false;
			}
			i ++;
			head = head.next;
		}
//		System.out.println(i + " and  " + head);
		return head == null && i == vals.length;
	}
}
