package com.crajas.leetcode.thirtydays;

public class ListMiddle {
	class Solution {
	    public ListNode middleNode(ListNode head) {
	        ListNode hare = head;
	        ListNode rabbit = head;
	        
	        while(rabbit != null) {
	        	rabbit = rabbit.next;
	        	if(rabbit != null){
                    rabbit = rabbit.next;
                    hare = hare.next;
                }
    
	        }
	        return hare;
	        
	    }
	}
}
