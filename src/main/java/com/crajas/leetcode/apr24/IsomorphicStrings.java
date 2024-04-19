package com.crajas.leetcode.apr24;

public class IsomorphicStrings {
    class Solution {
        public boolean isIsomorphic(String s, String t) {

            int[] r = fill(t);
            int[] l = fill(s);
            for(int i = 0; i < r.length; ++i) {
                if(r[i] != l[i]) return false;
            }

            return true;
        }

        private int[] fill(String str) {
            int[] strint = new int[str.length()];
            int[] positions = new int[256];
            for(int i = 0; i < str.length(); ++i) {
                int c = str.charAt(i);
                if(positions[c] == 0) {
                    positions[c] = i+1;
                }
                strint[i] = positions[c];
            }
            return strint;
        }
    }
}
