package com.crajas.leetcode;


/**
 * {@link AddTwoNumbers} solves https://leetcode.com/problems/add-two-numbers/ 
 * 
 * @author B002471
 *
 */
public class AddTwoNumbers {
	public
	/*---------------------*/

	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode head = new ListNode(0);
			int carry = 0;
			ListNode t= head;
			while(l1 != null && l2 != null) {
				int n = l1.val + l2.val + carry;
				carry = n / 10;
				n = n % 10;
				ListNode x = new ListNode(n);
				t.next = x;
				t = x;
				l1 = l1.next;
				l2 = l2.next;
			}
			ListNode l = null;
			if (l1 != null) l = l1;
			else if (l2 != null) l = l2;

			while(l != null) {
				int n = l.val + carry;
				carry = n / 10;
				n = n % 10;
				ListNode x = new ListNode(n);
				t.next = x;
				t = x;
				l = l.next;
			}
			
			if(carry > 0) {
				t.next = new ListNode(carry % 10);
				if(carry > 9) {
					t = t.next;
					t.next = new ListNode(carry / 10);
				}
			}
			return head.next;
		}
	}

	/*---------------------*/



}
