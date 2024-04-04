package com.crajas.leetcode.mar24;

import com.crajas.leetcode.ListNode;

import java.util.List;

public class SubarrayProductLessThanK {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int l = nums.length;
            int tot = 0;
            ListNode head = null;
            int i = 0;
            for(int num : nums) {
                i ++;
                if (num < k) {
                    ListNode newhead = new ListNode(num);
                    if (num != 1) {
                        ListNode p = newhead;
                        ListNode q = head;
                        tot++;
                        while (q != null) {
                            int x = q.val * num;
                            if (x < k) {
                                p.next = new ListNode(x);
                                tot++;
                                p = p.next;
                            }
                            q = q.next;
                        }
                        head = newhead;
                    } else {
                        newhead.next = head;
                        head = newhead;
                        while(newhead != null) {
                            tot++;
                            newhead = newhead.next;
                        }
                    }
                } else {
                    head = null;
                }
            }
            System.out.println(head);
            old(nums, k);
            return tot;
        }

        public void old(int[] nums, int k) {

            int l = nums.length;
            int tot = 0;
            int[][] prods = new int[l][l];
            prods[0] = new int[1];
            prods[0][0] = nums[0];
            if (prods[0][0] < k) {
                System.out.printf("*");
                tot++;
            }
            System.out.printf("%d\n", prods[0][0]);
            for (int i = 1; i < l; i++) {
                prods[i] = new int[i + 1];
                prods[i][0] = nums[i];
                if (prods[i][0] < k) {
                    System.out.printf("*");
                    tot++;
                }
                System.out.printf("%d, ", prods[i][0]);
                for (int j = 1; j <= i; j++) {
                    prods[i][j] = prods[i - 1][j - 1] > k ? Integer.MAX_VALUE : prods[i][0] * prods[i - 1][j - 1];
                    if (prods[i][j] < k) {
                        System.out.printf("*");
                        tot++;
                    }
                    System.out.printf("%d, ", prods[i][j]);
                }
                System.out.println();
            }
            System.out.println("Finally: " + tot);
        }
    }
}

/**
                 1
           2     2
      3    6     6
 4   12   24    24

 */