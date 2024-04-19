package com.crajas.fb.interview;

import com.crajas.leetcode.TreeNode;

public class MaxSumSubTree {
    public int findMax(TreeNode tn) {
        int lv = tn.left == null ? 0 : findMax(tn.left);
        int rv = tn.right == null ? 0 : findMax(tn.right);

        int max = Math.max(lv, rv);

        max = Math.max(0, max);
        return max;
    }

}
