package com.crajas.leetcode;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		ListNode node = this;
		while(node != null) {
			s.append(String.format("%d->", node.val));
			node = node.next;
		}
		return s.toString();
	}
}
