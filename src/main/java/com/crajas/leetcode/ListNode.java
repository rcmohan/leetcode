package com.crajas.leetcode;

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
			s.append(String.format("%d->", node.val));
			node = node.next;
		}
		return s.toString();
	}
}
