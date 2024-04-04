package com.crajas.leetcode.mar24;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: Not working yet
 */
public class LengthOfLongestSubarrayWithUtmostKFrequency {
    class Solution {
        public int maxSubarrayLength(int[] nums, int k) {
            if(k == 0) {
                return 0;
            }
            int maxlen = 1;
            int left = 0;
            int right = -1;
            Map<Integer, Integer> map = new HashMap<>();
            while(right < nums.length - 1){
                right ++;
                Integer val = map.get(nums[right]);
                val = val == null ? 1 : val + 1;
                if(val > k) {
                    left ++;
                } else {
                    map.put(nums[right], val);
                }

                int sofar = right-left + 1;
                if (maxlen < sofar) {
                    maxlen = sofar;
                }
            }
            return maxlen;
        }
    }
}
