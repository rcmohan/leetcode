package com.crajas.leetcode;

public class MergeKSortedLists {

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {

			class ListNode2 {
				public ListNode node;
				public ListNode2 next;

				public ListNode2(ListNode n) {
					this.node = n;
				};
				
				public String toString() {
					StringBuilder s = new StringBuilder();
					ListNode2 t = this;
					while(t != null) {
						s.append(String.format("(%s)->", t.node));
						t = t.next;
					}
					return s.toString();
				}

			}

			ListNode head = new ListNode(0);
			ListNode tail = head;
			boolean over = false;
			ListNode2 nodes = new ListNode2(null);
			ListNode2 ptr = nodes;
			ListNode2 min = null;
			for (int i = 0; i < lists.length; ++i) {
				ListNode list = lists[i];
				if (list != null) {
					ptr.next = new ListNode2(list);
					ptr = ptr.next;
				}
			}
			while (!over) {
				ptr = nodes.next;
				if(ptr != null && ptr.node == null) {
					nodes.next = ptr.next;
				} else {
					min = null;
					while (ptr != null) {
						if (ptr.next != null && ptr.next.node == null) {
							System.out.println("Eliminiating mid node");
							ptr.next = ptr.next.next;
						} else {
							ListNode list = ptr.node;
							if (min != null) {
								if (min.node.val > list.val) {
									min = ptr;
								}
							} else {
								min = ptr;
							}
						}
						ptr = ptr.next;
					}
					if (min != null) {
						tail.next = new ListNode(min.node.val);
						tail = tail.next;
						min.node = min.node.next;
						min = null;
					} else {
						over = (nodes.next == null);
					}
				}
			}
			return head.next;
		}

	}
	
	class Solution2 {

		public ListNode mergeKLists(ListNode[] lists) {

			ListNode head = new ListNode(0);
			ListNode tail = head;
			boolean over = false;
			int minpos = -1;
			ListNode min = null;
			int overs = 0;
			while (!over) {
				minpos = -1;
				min = null;
				overs = 0;
				for (int i = 0; i < lists.length; ++i) {
					ListNode list = lists[i];
					if (list != null) {
						if (min != null) {
							if (min.val > list.val) {
								minpos = i;
								min = list;
							}
						} else {
							min = list;
							minpos = i;
						}
					} else {
						overs ++;
					}
				}
				over = (overs == lists.length);
				if (!over) {
					tail.next = new ListNode(min.val);
					tail = tail.next;
					lists[minpos] = lists[minpos].next;
				}
			}
			return head.next;
		}

	}
}
