package com.crajas.leetcode.mar24;

public class MinimumCommonValue {
    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {
            int i = 0;
            int j = 0;
            while(i < nums1.length && j < nums2.length && nums1[i] != nums2[j]) {
                if(nums1[i] < nums2[j]) {
                    i ++;
                } else {
                    j ++;
                }
            }
            if(i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
                return nums1[i];
            } else {
                return -1;
            }
         }
    }
}
