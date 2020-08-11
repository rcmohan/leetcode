package com.crajas.fb.interview;

import com.crajas.leetcode.ListNode;

public class AddLists {

	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode l1r = rev(l1);
	        ListNode l2r = rev(l2);
	        int c = 0;
	        ListNode res = new ListNode(0);
	        ListNode t = res;
	        while(l1r != null || l2r != null) {
	            int n1 = l1r != null ? l1r.val : 0;
	            int n2 = l2r != null ? l2r.val : 0;
	            int n3 = n1 + n2 + c;
	            if(n3 >= 10) {
	                c = n3 / 10;
	                n3 = n3 % 10;
	            } else {
	                c = 0;
	            }
	            ListNode x = new ListNode(n3);
	            t.next = x;
	            l1r = l1r != null ? l1r.next : null;
	            l2r = l2r != null ? l2r.next : null;
	            
	            t = x;
	        }
	        if (c > 0) {
	            t.next = new ListNode(c);
	        }
	        return rev(res.next);
	    }
	    
	    public ListNode rev(ListNode l) {
	        ListNode x = null;
	        while(l != null) {
	            ListNode t = new ListNode(l.val);
	            l = l.next;
	            t.next = x;
	            x = t;
	        }
	        return x;
	    }
	}
}
