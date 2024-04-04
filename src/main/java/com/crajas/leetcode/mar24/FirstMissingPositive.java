package com.crajas.leetcode.mar24;

import java.util.Arrays;

/**
 * TODO: Not working yet
 */
public class FirstMissingPositive {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int l = nums.length;
            System.out.println(Arrays.toString(nums));
            int i = 0;
            while(i < l) {
                int curr = nums[i];
                if(curr == i + 1) {
                    i ++;
                    continue;
                }
                if(curr > 0 && curr <= l) {
                    int other = nums[curr - 1];
                    System.out.printf("%d, %d, %d\n", i, curr, other);
                    if(other > 0 && other <= l) {
                        nums[i] = other;
                    } else {
                        nums[i] = 0;
                        i ++;
                    }
                    nums[curr-1] = curr;
                } else {
                    return i + 1;
                }
            }
            System.out.println(Arrays.toString(nums));
            return l;
        }
    }
}

/*
3, 1, 0, 4

 */