package com.crajas.leetcode.mar24;

import java.util.Arrays;

public class CustomSortString {
    class Solution {
        public String customSortString(String order, String s) {
            int[] charCounts = new int[26];
            int[] orders = new int[26];
            StringBuffer sb = new StringBuffer();
            int aVal = 'a';

            int i = 0;
            for(char c : order.toCharArray()) {
                orders[i] = c - aVal;
                i ++;
            }
            for(char c : s.toCharArray()) {
                charCounts[c - 'a']++;
            }
            System.out.println("order:" + Arrays.toString(orders));
            System.out.println("counts:" + Arrays.toString(charCounts));
            for (int j = 0; j < order.length(); ++j) {
                int pos = orders[j];
                char c = (char) (aVal + pos);
                System.out.printf("%s", c);
                for(int k = 0; k < charCounts[pos]; ++k) {
                    sb.append(c);
                }
                charCounts[pos] = 0;
            }

            System.out.println("\ncounts:" + Arrays.toString(charCounts));
            for(char c : s.toCharArray()) {
                if(charCounts[c - 'a'] != 0) {
                    sb.append(c);
                };
            }

            System.out.println();
            System.out.println(sb);

            return sb.toString();
        }
    }
}
