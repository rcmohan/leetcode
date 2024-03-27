package com.crajas.leetcode.mar24;

import com.crajas.leetcode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveZeroSumConsecIntsFromListTest {

    static RemoveZeroSumConsecIntsFromList.Solution solution = new RemoveZeroSumConsecIntsFromList().new Solution();

    @Test
    public void test1() {
        int[][] testVals = new int[][]{
                {1, 2, -3, 3, 1},
                {1, 2, 3, -3, 4},
                {1, 2, 3, -3, -2},
                {1,3,2,-3,-2,5,5,-5,1},
                {-1, 1}
        };
        int[][] expected1 = new int[][]{{1, 2, 1}, {1, 2, 4}, {1}, {1,5,1}, {}};
        int[][] expected2 = new int[][]{{3, 1}, {}, {}, {}, {}};

        for (int i = 0; i < testVals.length; ++i) {
            ListNode head = ListNode.createFromArray(testVals[i]);
            System.out.println("Input: ");
            System.out.println(head);
            ListNode val = solution.removeZeroSumSublists(head);
            System.out.println("Output: ");
            System.out.println(val);
            boolean val1 = ListNode.compare(val, expected1[i]);
            boolean val2 = false;
            if (expected2[i].length > 0) {
                val2 = ListNode.compare(val, expected2[i]);
            }
            assertTrue(val1 || val2);
        }

    }

}
/*

0   1   2   3   4
0   1   3   0
1       -1
2
3
4
*/
