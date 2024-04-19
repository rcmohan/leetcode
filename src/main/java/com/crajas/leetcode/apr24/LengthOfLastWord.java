package com.crajas.leetcode.apr24;

public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            int len = 0;
            boolean found = false;
            int i = s.length();
            while(i > 0) {
                i--;
                char c = s.charAt(i);
                if (c == ' ') {
                    if(found) {
                        return len;
                    }
                } else {
                    len ++;
                    found = true;
                }
            }
            return len;
        }
    }
}
