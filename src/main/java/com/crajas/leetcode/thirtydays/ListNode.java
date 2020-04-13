package com.crajas.leetcode.thirtydays;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		ListNode x = this;
		StringBuffer s = new StringBuffer();
		while (x != null) {
			s.append(String.format("[%s]-", val));
			x = x.next;
		}
		return s.toString();
	}

}
