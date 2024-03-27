package com.crajas.leetcode.mar24;

import java.io.PrintStream;

public class PivotInteger {
    class Solution {
        public int pivotInteger(int n) {
            System.out.printf("Processing {%d}\n", n);
            if (n == 1) {
                return 1;
            }
            int total = n * (n + 1) / 2;
            System.out.printf("for n: {%d}, total: {%d}\n", n, total);

            int sum = 1;
            int i = 1;
            int calc = (total + i - sum);

            while (sum != calc && i < n - 1) {
                i++;
                sum += i;
                calc = (total + i - sum);

                System.out.printf("sum: {%d}, total: {%d}, calc = {%d} at i = {%d}\n", sum, total, calc, i);

            }
            System.out.printf("Finally, sum: {%d}, total: {%d}, calc = {%d} at i = {%d}\n", sum, total, calc, i);
            return sum == calc ? i : -1;
        }

    }

        public int pivotInteger2(int n) {
            System.out.printf("Processing {%d}\n", n);
            if(n == 1) {
                return 1;
            }
            int low = 1;
            int high = n - 1;
            int sum = n;
            while(sum != 0 && low <= high) {
                System.out.printf("{%d}{%d}{%d}\n", sum, low, high);
                if (sum > 0) {
                    sum -= low;
                    low ++;
                } else {
                    sum += high;
                    high --;
                }
            }

            System.out.printf("Final: {%d}{%d}{%d}\n", sum, low, high);
            return low == high ? low : -1;
        }

}
