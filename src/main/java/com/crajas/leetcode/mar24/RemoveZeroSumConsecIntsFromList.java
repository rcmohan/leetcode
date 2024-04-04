package com.crajas.leetcode.mar24;

import com.crajas.leetcode.ListNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * TODO: Not working yet
 */
public class RemoveZeroSumConsecIntsFromList {

    class Solution {
        public ListNode removeZeroSumSublists(ListNode head) {
            Map<Integer, ListNode> vals = new HashMap<>();

            int sum = 0;
            int i = 0;
            ListNode prev = new ListNode(0);
            prev.next = head;
            ListNode p = head;
            vals.put(0, prev);
            while(p != null) {
                i++;
                sum = sum + p.val;
                ListNode p1 = vals.get(sum);
                if (p1 == null) {
                    vals.put(sum, p);
                } else {
                    p1.next = p.next;
                }
                p = p.next;
            }

            return prev.next;
        }
    }
}
