package com.crajas.leetcode.hard;

import com.crajas.leetcode.ListNode;

public class ReverseNodesKGroup {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public ListNode reverseKGroup(ListNode head, int j) {
	    	if(head == null || head.next == null || j <= 1) {
	    		return head;
	    	}
	    	int n = size(head) - j;
    		head = reverseKNodes(head, j);
    		int k = 0;
	    	while(n >= j) {
	    		n -= j;
	    		k+= j;
	    		ListNode p = traverse(head, k - 1);
	    		p.next = reverseKNodes(p.next, j);
	    		
	    	}
	        return head;
	    }

		private int size(ListNode head) {
			ListNode p = head;
			int size = 1;
			while(p.next != null) {
				p = p.next;
				size ++;
			}
			return size;
		}
		
		private ListNode traverse(ListNode head, int j) {
			ListNode p = head;
			while(j -- > 0) {
				p = p.next;
			}
			return p;
		}

		private ListNode reverseKNodes(ListNode head, int j) {
			ListNode p = head;
	        ListNode q = null;
	        
	        if(j <= 0) return head;
	        if(p != null && p.next != null) {
		        int k = j - 1;
	        	q = head.next;
	        	ListNode r = q.next;
		        while(k-- > 0 && q != null) {
		        	q.next = head;
		        	p.next = r;
		        	head = q;
		        	q = r;
		        	r = r==null ? null : r.next;
		        }
//		        System.out.printf("P: %d, Q: %d, R: %s\n", p.val, (q==null?-1:q.val), r);
//		        System.out.println("Finally " + head);
	        }
	        return head;
		}
	}
}
